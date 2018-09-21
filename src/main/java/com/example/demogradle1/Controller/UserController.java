package com.example.demogradle1.Controller;


import com.example.demogradle1.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.example.demogradle1.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping( "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

   // @GetMapping("/getUser")
   // public String greetingForm(Model model) {
       // model.addAttribute("user", new User());
       // return "greeting";
   // }
    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public String  greetingSubmit(@ModelAttribute User user) {

        User newUser = new User();
        newUser.setName(user.getName());
        newUser.setAge(user.getAge());
        newUser.setType(user.getType());
        newUser.setHeight(user.getHeight());
        newUser.setWeight(user.getWeight());
        newUser.setBMIindex(user.getBMIindex());
        newUser.setValue1(user.getValue1());


        userRepository.save(user);
        return "result";
    }

    //@GetMapping("/all")
    //public String getMess age(Model model) {

//        Iterable<User> users = userRepository.findAll();
//        model.addAttribute("users", users);
        //return "all";
    //}



}
