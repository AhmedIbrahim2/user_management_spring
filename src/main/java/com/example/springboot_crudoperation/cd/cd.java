package com.example.springboot_crudoperation.cd;

import com.example.springboot_crudoperation.user.user;
import jakarta.persistence.*;

@Entity
public class cd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cd_id;
    private String name ;
    private String type ;
    private int size ;


    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private user user1;

    public user getUser1() {
        return user1;
    }

    public void setUser1(user user1) {
        this.user1 = user1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Long getId() {
        return cd_id;
    }

    public void setId(Long id) {
        this.cd_id = cd_id;
    }
}
