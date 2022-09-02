package ru.zharkov.springboot.springboot311.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.zharkov.springboot.springboot311.dao.UserDao;
import ru.zharkov.springboot.springboot311.dao.UserDaoImp;
import ru.zharkov.springboot.springboot311.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
   private UserDao userDaoImp = new UserDaoImp();

   public UserServiceImp(UserDao userDaoImp) {
      this.userDaoImp = userDaoImp;
   }

   @Transactional
   @Override
   public void addUser(User user) {
      userDaoImp.addUser(user);
   }

   @Transactional
   @Override
   public void updateUser(Long id, User updatedUser) {
      userDaoImp.updateUser(id, updatedUser);
   }

   @Transactional
   @Override
   public void deleteUser(Long id) {
      userDaoImp.deleteUser(id);
   }

   @Transactional(readOnly = true)
   @Override
   public User getUserById(Long id) {
      return userDaoImp.getUserById(id);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDaoImp.listUsers();
   }

}
