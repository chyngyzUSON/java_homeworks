package com.wallet.dao;

import com.wallet.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserDao {
    private static HashMap<Long, User> users = new HashMap<>();

    static{
        User u1 = User.builder()
                .id(1L)
                .name("User-1")
                .password("777")
                .createdDate(new Date())
                .build();
        User u2 = User.builder()
                .id(2L)
                .name("User-2")
                .password("777")
                .createdDate(new Date())
                .build();
        users.put(1L, u1);
        users.put(2L, u2);
    }

    public List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }

    public  User getUserById(Long userId){
        return users.get(userId);
    }

    public User createUser(User user){
        users.put(user.getId(), user);
        return users.get(user.getId());
    }

    public User updateUser(User user){
        users.put(user.getId(), user);
        return users.get(user.getId());
    }

    public void deleteUserById(Long userId){
        users.remove(userId);
    }


}
