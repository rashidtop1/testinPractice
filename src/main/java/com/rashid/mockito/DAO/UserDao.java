package com.rashid.mockito.DAO;

import com.rashid.mockito.model.User;

import java.util.List;

public interface UserDao {
    User getUserByUsername(String username) throws Exception;

    List<User> findAllUsers();
}
