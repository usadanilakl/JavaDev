package com.database.spring_orm;

import com.database.spring_orm.entities.permits.BasePermit;
import com.database.spring_orm.entities.permits.hot_works.Hw;
import com.database.spring_orm.entities.permits.lotos.Box;
import com.database.spring_orm.entities.permits.lotos.Lock;
import com.database.spring_orm.entities.permits.lotos.Loto;
import com.database.spring_orm.entities.permits.safe_works.Sw;
import com.database.spring_orm.entities.permits.tickets.Ticket;
import com.database.spring_orm.enums.PermitType;
import com.database.spring_orm.repo.permits.hot_work_repo.HwRepo;
import com.database.spring_orm.repo.permits.loto_repo.BoxRepo;
import com.database.spring_orm.repo.permits.loto_repo.LockRepo;
import com.database.spring_orm.repo.permits.loto_repo.LotoRepo;
import com.database.spring_orm.repo.permits.safe_work_repo.SwRepo;
import com.database.spring_orm.repo.permits.ticket_repo.TicketRepo;
import com.database.spring_orm.service.permits.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@AllArgsConstructor
public class SpringOrmApplication implements CommandLineRunner {
    private final HwRepo hwRepo;
    private final SwRepo swRepo;
    private final LotoRepo lotoRepo;
    private final LockRepo lockRepo;
    private final BoxRepo boxRepo;
    private final TicketRepo ticketRepo;
    private final TicketService ticketService;


    public static void main(String[] args) {
        SpringApplication.run(SpringOrmApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {

        buildLotoList();

        Ticket ticket = ticketRepo.findAll().get(0);
        System.out.println("ticket.getType() = " + ticket.getType());
        List<BasePermit> permits = ticket.getPermits();
        Loto loto = null;
        for (BasePermit e : permits) {
            System.out.println(e.getType());
            if(e.getType().equals(PermitType.LOTO)) loto=(Loto)e;
        }
        if(loto!=null){
            System.out.println(loto.getBox().getNumber());
            System.out.println(loto.getLocks());
        }




    }

    private void buildAll(){
        Hw hw1 = new Hw();
        hw1.setRequestor("Danil");
        Hw hw2 = new Hw();
        hw2.setRequestor("Ivan");
        hwRepo.save(hw1);
        hwRepo.save(hw2);

        Sw sw1 = new Sw();
        sw1.setControlAuthority("Hello");
        Sw sw2 = new Sw();
        sw2.setControlAuthority("Be Safe");
        swRepo.save(sw1);
        swRepo.save(sw2);

        Box box1 = new Box();
        box1.setNumber(55);
        boxRepo.save(box1);

        Lock lock1 = new Lock();
        lock1.setNumber(31);
        Lock lock2 = new Lock();
        lock2.setNumber(32);
        Lock lock3 = new Lock();
        lock3.setNumber(33);
        lockRepo.save(lock2);
        lockRepo.save(lock1);
        lockRepo.save(lock3);

        Loto loto1 = new Loto();
        loto1.setBox(box1);
        box1.setLoto(loto1);
        loto1.setLocks(new ArrayList<>(Arrays.asList(lock1,lock2,lock3)));
        lock1.setLoto(loto1);
        lock2.setLoto(loto1);
        lock3.setLoto(loto1);
        loto1.setEquipment("pump");
        lotoRepo.save(loto1);

        Ticket ticket1 = new Ticket();
        ticket1.setPermits(new ArrayList<>(Arrays.asList(hw1,hw2,sw1,sw2,loto1)));
        ticketRepo.save(ticket1);
    }
    private void buildLotoList(){
        Loto loto1 = new Loto();
        loto1.setRequestor("Andrew");
        lotoRepo.save(loto1);
        Loto loto2 = new Loto();
        loto1.setRequestor("Danil");
        lotoRepo.save(loto2);
        Loto loto3 = new Loto();
        loto1.setRequestor("Cory");
        lotoRepo.save(loto3);
        Loto loto4 = new Loto();
        loto1.setRequestor("Ryan");
        lotoRepo.save(loto4);

    }
}
