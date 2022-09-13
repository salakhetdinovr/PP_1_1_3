package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService  {
    UserDao userDaoJDBC = new UserDaoJDBCImpl();

    public UserServiceImpl() {
    }

    public void createUsersTable() throws SQLException {
    userDaoJDBC.createUsersTable();
    }

    public void dropUsersTable() {
    userDaoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
    userDaoJDBC.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws SQLException {
    userDaoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {

        return userDaoJDBC.getAllUsers();
    }

    public void cleanUsersTable() {
    userDaoJDBC.cleanUsersTable();
    }
}
