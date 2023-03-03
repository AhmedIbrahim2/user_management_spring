package com.example.springboot_crudoperation.cd;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface cdServices {

    public List<cd> getAll();

    public cd getById (Long id);

    public void deleteById(Long id);

    public cd save(cd cd);

    public cd EditById(Long id , cd cd);
}
