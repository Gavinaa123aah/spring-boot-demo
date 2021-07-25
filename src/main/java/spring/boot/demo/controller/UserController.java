package spring.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.demo.entity.User;
import spring.boot.demo.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
//
//    @ResponseBody
//    @GetMapping("/users/list")
//    public List<User> queryUsers(){
//       return userService.queryUsers();
//    }
}
