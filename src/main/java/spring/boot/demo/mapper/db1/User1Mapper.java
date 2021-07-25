package spring.boot.demo.mapper.db1;

import org.apache.ibatis.annotations.Mapper;
import spring.boot.demo.entity.User;

import java.util.List;

@Mapper
public interface User1Mapper {


    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
