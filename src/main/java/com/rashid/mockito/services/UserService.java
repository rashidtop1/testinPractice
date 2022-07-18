package com.rashid.mockito.services;

import com.rashid.mockito.DAO.UserDao;
import com.rashid.mockito.model.User;

public class UserService {
    private UserDao dao;

    public UserService(UserDao dao) {
        this.dao = dao;
    }

    public boolean checkUserPresence(User user) throws Exception {
        User u = dao.getUserByUsername(user.getUsername());

        return u != null;
    }
}
