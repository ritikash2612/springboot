package com.springbootapp.webapp.restfulwebservices;

import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserDaoService userService;
  // get /users
  @GetMapping("/users")
  public List<User> retrieveAllUsers(){
    return userService.findAll();
  }

  @GetMapping("/users/{id}")
  public User retrieveAllUsers(@PathVariable int id) {
    User user = userService.findUser(id);
    if (user == null) {
      throw new UserNotFoundException("id"+id);
    }
    return user;
  }

  //create new User
  @PostMapping("/users")
  public ResponseEntity createUser(@RequestBody User user){
    User savedUser = userService.save(user);
    System.out.println("user saved is: " + user.getName());

    //created status
    URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
    return ResponseEntity.created(location).build();

  }
}
