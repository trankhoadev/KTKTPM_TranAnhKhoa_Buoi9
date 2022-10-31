package com.trananhkhoa_19501151.springredisbuoi8;

import com.trananhkhoa_19501151.springredisbuoi8.Model.User;

import java.util.Map;

public interface UserRepository {
    void save(User user);
    Map<String, User> findAll();
    User findById(String id);
    void update(User user);
    void delete(String id);
}
