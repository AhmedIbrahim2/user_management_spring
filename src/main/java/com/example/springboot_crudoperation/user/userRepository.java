package com.example.springboot_crudoperation.user;

import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<user, Long> {
    public Long countById(Long id);

}
