package com.example.springboot_crudoperation.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServices_Imp implements userServices {
    @Autowired
   private userRepository repo ;

    @Override
    public List<user> listall() {
        return (List<user>) repo.findAll();
    }

    @Override
    public user getuserbyid(Long id) throws UserNotFoundException {
        Optional<user> result =repo.findById(id);
        if(result.isPresent()){
            return result.get();
        }
       throw new UserNotFoundException("Couldn't find any user with ID "+ id);
    }

    @Override
    public void deletebyid(Long id) throws UserNotFoundException {
        Long count = repo.countById(id);
        if(count ==null || count ==0){
            throw new UserNotFoundException("Couldn't find any user with ID "+ id);
        }
        repo.deleteById(id);
    }

    @Override
    public user edituser(Long id , user edituser){
        user user1 = repo.findById(id).get();
        edituser = user1;
     return repo.save(edituser);
    }

    @Override
    public user saveuser(user user1){
        return repo.save(user1);
    }


}
