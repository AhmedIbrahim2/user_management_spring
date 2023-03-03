package com.example.springboot_crudoperation.user;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface userServices {
    public List<user> listall() ;
    public user getuserbyid(Long id) throws UserNotFoundException;
    public user saveuser(user user);

    public void deletebyid(Long id) throws UserNotFoundException;

    public user edituser(Long id , user edituser) ;

}
