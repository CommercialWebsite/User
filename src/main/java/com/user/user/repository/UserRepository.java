package com.user.user.repository;

import com.user.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository  extends MongoRepository<User,String>{
    public User findById(String id);
    public User findByName(String name);
    public User findByLogin(String login);
    public List<User> findByType(String Type);

}
