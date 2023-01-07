package io.typetowrite.springwsstarter.user;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    private UserService service;
    public UserResource(UserService service){
        this.service = service;
    }
    @GetMapping("/users")
    public List<User>  retrieveAllUsers(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        service.save(user);
    }

}
