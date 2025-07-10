package com.example.truecaller.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.truecaller.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class UserDAO {

    // Alternative for database connection for now
    private final Map<Long, User> userDatabase = new HashMap<>();

    private Long idCounter = 1L;

    public User save(User user) {
        user.setId(idCounter++);
        userDatabase.put(user.getId(), user);
        return user;
    }

    public User findByUserName(String userName) {
        for (User user : userDatabase.values()) {
            if(user.getUsername().equals(userName)) {
                return user;
            }
        }
        return null;
    }
}
