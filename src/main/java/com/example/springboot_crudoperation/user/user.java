package com.example.springboot_crudoperation.user;


import com.example.springboot_crudoperation.cd.cd;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class user {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ;

   private String email;

    public user() {
    }

    private String password;
   private String firstName;
   private String lastName;

   private boolean enabled;

   @OneToMany(mappedBy = "user1")
   private List<cd> cds;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
