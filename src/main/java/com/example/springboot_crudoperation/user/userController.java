package com.example.springboot_crudoperation.user;

import com.example.springboot_crudoperation.cd.cd;
import com.example.springboot_crudoperation.cd.cdServices_Imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class userController {



    @Autowired
    private userServices_Imp services ;


  @GetMapping("/users")
    public String listall(Model model){
      try {
          List<user> listeduser = services.listall();
          model.addAttribute("listeduser" ,listeduser);
          return "user/users";
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
  }

  @GetMapping("/users/{id}")
  public String getuserbyid(@PathVariable("id") Long id ,Model model) throws UserNotFoundException {
      try {
          user user1 = services.getuserbyid(id);
          model.addAttribute("user",user1);
          model.addAttribute("pageTitle","Get User (ID :"+id + " )");
          return "user/users";

      } catch (Exception e) {
          throw new UserNotFoundException("User Not Found");
      }
  }

  @GetMapping("/users/new")
    public String newForm(Model model){
      try {
          model.addAttribute("user",new user());
          model.addAttribute("pageTitle","Add New User");
          return "user/user_form";

      } catch (Exception e) {
          throw new RuntimeException(e);
      }
  }

  @PostMapping("/users/save")
    public String saveUser(user user1 , RedirectAttributes ra){
      try {
          services.saveuser(user1);
          ra.addFlashAttribute("message","The User has been added Successfully .");
          return "redirect:/users";
      } catch (Exception e) {
          throw new RuntimeException(e);
      }

  }


  @GetMapping("/users/edit/{id}")
    public String editform(@PathVariable("id") Long id , Model model, RedirectAttributes ra ){
      try {
        user user1=  services.getuserbyid(id);
        model.addAttribute("user",user1);
          model.addAttribute("pageTitle","Edit User (ID :"+id + " )");
          ra.addFlashAttribute("message" , "user has been edit successfully");
          return "user/user_form";
      } catch (UserNotFoundException e){
          e.printStackTrace();
          return "redirect:user/users";
      }

  }
  
  
  @GetMapping("/users/delete/{id}")
    public String delete(@PathVariable("id")Long id ,Model model){
      try {
          user user = services.getuserbyid(id);
          model.addAttribute("user",user);
          services.deletebyid(id);
          return "user/user_form";
      } catch (UserNotFoundException e){
          e.printStackTrace();
          return "redirect:user/users";
      }

  }
}
