package com.example.springboot_crudoperation;

import com.example.springboot_crudoperation.user.user;
import com.example.springboot_crudoperation.user.userRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class userRepoTest {

     /*
    @Autowired
    private userRepository repo;


    @Test
    public  void addnew(){
        user  user = new user();
        user.setEmail("ahmed@gmail.com");
        user.setFirstName("ahmed");
        user.setPassword("12345");
        user.setLastName("aboali");
      user user1 =  repo.save(user);

        Assertions.assertThat(user1).isNotNull();
        Assertions.assertThat(user1.getId()).isGreaterThan(0);

    }
    

    @Test
    public void getall(){
        Iterable<user> users = repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for (user user : users){
            System.out.print(user);
        }
    }


    @Test
    public void Update(){
        Integer id = 1;
        Optional<user> user1 = repo.findById(1);
        user user2 = user1.get();
        user2.setPassword("4386571");

        repo.save(user2);

        user updated = repo.findById(id).get();
        Assertions.assertThat(updated.getPassword()).isEqualTo("4386571");

    }


    @Test
    public void delete(){
        Integer id = 2;
        repo.deleteById(id);


        Optional<user> user = repo.findById(id);
        Assertions.assertThat(user).isNotPresent();
    }


    @Test
    public void getbyid(){
        Integer id = 3;
        Optional<user> user = repo.findById(id);

        Assertions.assertThat(user).isPresent();
    }
    */



}
