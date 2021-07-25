package spring.boot.demo.mapper.db2;

import org.apache.ibatis.annotations.Mapper;
import spring.boot.demo.entity.User;

import java.util.List;

@Mapper
public interface User2Mapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
