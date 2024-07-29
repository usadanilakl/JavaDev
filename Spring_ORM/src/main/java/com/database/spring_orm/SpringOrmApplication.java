package com.database.spring_orm;

import com.database.spring_orm.entities.ChildEntity;
import com.database.spring_orm.entities.OneParentedChild;
import com.database.spring_orm.entities.ParentEntity;
import com.database.spring_orm.repo.ChildRepo;
import com.database.spring_orm.repo.OneParentedChildRepo;
import com.database.spring_orm.repo.ParentRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@SpringBootApplication
@AllArgsConstructor
public class SpringOrmApplication implements CommandLineRunner {
    private final ChildRepo childRepo;
    private final ParentRepo parentRepo;
    private final OneParentedChildRepo oneParentedChildRepo;



    public static void main(String[] args) {
        SpringApplication.run(SpringOrmApplication.class, args);
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {

//        childRepo.save(new ChildEntity("Child1","Feature1"));
//        childRepo.save(new ChildEntity("Child2","Feature2"));
//        childRepo.save(new ChildEntity("Child3","Feature3"));
//        childRepo.save(new ChildEntity("Child4","Feature4"));
//        childRepo.save(new ChildEntity("Child5","Feature5"));
//
//        parentRepo.save(new ParentEntity("Parent1","Feature1"));
//        parentRepo.save(new ParentEntity("Parent2","Feature2"));
//        parentRepo.save(new ParentEntity("Parent3","Feature3"));
//        parentRepo.save(new ParentEntity("Parent4","Feature4"));
//        parentRepo.save(new ParentEntity("Parent5","Feature5"));

//        oneParentedChildRepo.save(new OneParentedChild("Cild1","Feature5"));
//        oneParentedChildRepo.save(new OneParentedChild("Cild2","Feature5"));
//        oneParentedChildRepo.save(new OneParentedChild("Cild3","Feature5"));
//        oneParentedChildRepo.save(new OneParentedChild("Cild4","Feature5"));
//        oneParentedChildRepo.save(new OneParentedChild("Cild5","Feature5"));

        List<ParentEntity> allParent = parentRepo.findAll();
        List<ChildEntity> allChild = childRepo.findAll();
        List<OneParentedChild> allOneParented = oneParentedChildRepo.findAll();

        System.out.println("allChild.size() = " + allChild.size());
        System.out.println("allParent.size() = " + allParent.size());
        System.out.println("allOneParented.size() = " + allOneParented.size());

        ParentEntity parentEntity = allParent.get(0);
        ChildEntity childEntity = allChild.get(0);
        ParentEntity parentEntity2 = allParent.get(2);
        OneParentedChild oneParentedChild = allOneParented.get(0);

        /**************************************************************************************
         * Add and remove items through parent entity with CascadeType.ALL
         *************************************************************************************/

//        parentEntity.getChildItems().add(childEntity); //adds 1 item to list in both entities
//        parentRepo.save(parentEntity);

//        parentEntity.setChildItems(new ArrayList<>()); //removes all items from list in both entities
//        parentRepo.save(parentEntity);

//        parentEntity.setChildItems(childRepo.findAll()); //Adds all children into parent list, ands that parent into list in each child entity class
//        parentRepo.save(parentEntity);

//        parentEntity.getChildItems().removeIf(p->p.getId()==childEntity.getId()); //removes 1 item from parent class list and removes that parent from list in childEntity
//        parentRepo.save(parentEntity);

//        parentEntity2.getChildItems().add(childEntity);
//        parentRepo.save(parentEntity2);

//        allChild.get(3).setIsDeleted(true); //this soft deletes item that is then removed from all lists where it was included
//        childRepo.save(allChild.get(3));

//        System.out.println("parentEntity.getChildItems().size() = " + parentEntity.getChildItems().size());
//        System.out.println("childEntity.getParentItems().size() = " + childEntity.getParentItems().size());
//        System.out.println("allChild.get(2).getParentItems().size() = " + allChild.get(2).getParentItems().size());


        /**************************************************************************************
         * Add and remove items through child entity with CascadeType.ALL on parent side
         *************************************************************************************/
//        childEntity.getParentItems().add(parentEntity);
//        childRepo.save(childEntity); //this will not change anything

        /**************************************************************************************
         * Add and remove items with OneToMany relationship
         *************************************************************************************/
//        parentEntity.getOneParentedChildList().add(oneParentedChild); // this doesn't work
//        parentRepo.save(parentEntity);

//        oneParentedChild.setParent(parentEntity);
//        oneParentedChildRepo.save(oneParentedChild);

        System.out.println("oneParentedChild.getParent().getName() = " + oneParentedChild.getParent().getName());
        System.out.println("parentEntity.getOneParentedChildList().size() = " + parentEntity.getOneParentedChildList().size());
        System.out.println("parentEntity2.getOneParentedChildList().get(0).getName() = " + parentEntity2.getOneParentedChildList().size());


    }

}
