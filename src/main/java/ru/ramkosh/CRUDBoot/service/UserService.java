package ru.ramkosh.CRUDBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.ramkosh.CRUDBoot.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public interface UserService {
  List<User> getAllUsers();
  User getUser( Long id);
  void addUser(User user);
  void updateUser(User newUser);
  void removeUser(Long id);

}
