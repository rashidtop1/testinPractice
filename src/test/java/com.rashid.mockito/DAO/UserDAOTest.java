package com.rashid.mockito.DAO;

import com.rashid.mockito.DAO.UserDao;
import com.rashid.mockito.DAO.UserDaoImpl;
import com.rashid.mockito.model.User;
import org.assertj.core.api.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;


public class UserDAOTest {
    private UserDao dao;



    @Before
    public void setUp() throws Exception {
        this.dao = new UserDaoImpl();
    }

    @Test
    public void getUserByUsername_Should_Return_True() throws Exception {
        User remy = dao.getUserByUsername("remy@gmail.com");
        assertThat(remy).isNotNull();
        assertThat(remy.getUsername()).isEqualTo("remy@gmail.com");
    }

    @Test
    public void getUserByUsername_Null_user() throws Exception {
        User alex = dao.getUserByUsername("alex@gmail.com");
        assertThat(alex).isNull();
    }

    @Test
    public void findAllUsers_Contain() throws Exception {
        List<User> allUsers = dao.findAllUsers();
        assertThat(allUsers.get(2)).isEqualToComparingFieldByField(
                new User("remy@gmail.com", "ADMIN")
        );

        assertThat(allUsers).contains(new User("remy@gmail.com", "ADMIN"));
    }
}
