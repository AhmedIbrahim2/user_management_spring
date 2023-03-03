package com.example.springboot_crudoperation.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class cdServices_Imp implements cdServices{

    @Autowired
    private cdRepository repo;


    @Override
    public List<cd> getAll() {
        return (List<cd>) repo.findAll();
    }

    @Override
    public cd getById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public cd save(cd cd) {
      return   repo.save(cd);
    }

    @Override
    public cd EditById(Long id , cd cd){
        cd cd1 = repo.findById(id).get();
        cd=cd1;
       return repo.save(cd);
    }
}
