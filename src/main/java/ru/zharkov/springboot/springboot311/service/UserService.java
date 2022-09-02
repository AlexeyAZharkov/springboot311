package ru.zharkov.springboot.springboot311.service;


import ru.zharkov.springboot.springboot311.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(Long id);
    void updateUser(Long id, User updatedUser);
    User getUserById(Long id);
    List<User> listUsers();
}
