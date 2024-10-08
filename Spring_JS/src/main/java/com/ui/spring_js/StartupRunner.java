package com.ui.spring_js;

import com.ui.spring_js.data_generator.DataGenerator;
import com.ui.spring_js.repository.LotoRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StartupRunner implements ApplicationRunner {
    private final DataGenerator dataGenerator;
    private final LotoRepo lotoRepo;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("================================================================================================================================");
        System.out.println("Application Started on http://localhost:8080/");
        System.out.println("================================================================================================================================");

//        dataGenerator.generateLotos();
//        lotoRepo.findAll().forEach(e->{
//            System.out.println(e);
//        });


    }
}