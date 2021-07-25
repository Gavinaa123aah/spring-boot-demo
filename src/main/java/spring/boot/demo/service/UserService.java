package spring.boot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.demo.entity.User;
import spring.boot.demo.mapper.db1.User1Mapper;
import spring.boot.demo.mapper.db2.User2Mapper;

import java.util.List;

@Service
public class UserService {


    @Autowired
    User1Mapper user1Mapper;

    @Autowired
    User2Mapper user2Mapper;


    public List<User> queryDb1Users(){
        return user1Mapper.getAll();
    }

    public List<User> queryDb2Users(){
        return user2Mapper.getAll();
    }

}
