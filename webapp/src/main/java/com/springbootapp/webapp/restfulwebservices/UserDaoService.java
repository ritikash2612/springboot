package com.springbootapp.webapp.restfulwebservices;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

  private static int usersCount = 3;
  private static List<User> users = new ArrayList<>();
  static {
    users.add(new User(1,"Ram", new Date()));
    users.add(new User(2,"Jack", new Date()));
    users.add(new User(3,"James", new Date()));
  }

  public List<User> findAll(){
    return users;
  }
  public User save(User user){
    if(user.getId() == null){
      user.setId(++usersCount);
    }
    users.add(user);
    return user;
  }

  public User findUser(int id){
    for(User user: users) {
      if (user.getId() == id)
        return user;
    }
    return null;
  }
}
