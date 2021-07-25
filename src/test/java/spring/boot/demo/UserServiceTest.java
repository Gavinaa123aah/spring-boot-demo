package spring.boot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.boot.demo.entity.User;
import spring.boot.demo.service.UserService;

import java.util.List;

@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

//    @Test
//    void testQueryUsers(){
//        List<User> userList = userService.queryUsers();
//        System.out.println(userList.toString());
//    }

    @Test
    void testQueryDb1Users(){
        List<User> userList = userService.queryDb1Users();
        System.out.println(userList.toString());
    }


    @Test
    void testQueryDb2Users(){
        List<User> userList = userService.queryDb2Users();
        System.out.println(userList.toString());
    }
}
