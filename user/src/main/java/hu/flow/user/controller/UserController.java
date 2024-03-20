package hu.flow.user.controller;

import hu.flow.user.model.Users;
import hu.flow.user.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public Users addUser(@RequestBody Users users) {
        return userService.addUser(users);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/list")
    public List<Users> listUsers(){
        return userService.listUsers();
    }

    @GetMapping("/listByName/{name}")
    public List<Users> listUsersByName(@PathVariable String name){
        return userService.getUsersByName(name);
    }

    @GetMapping("/listUsersPointsGreaterThan")
    public List<Users> getUsersGreaterThan(){
        return userService.getUsersGreaterThanPoints();
    }

    @PutMapping("/update")
    public Users updateUsers(@RequestBody Users users){
        return userService.updateUser(users);
    }

    @GetMapping("/listUsersPointsGreaterThan/{points}")
    public List<Users> getUsersGreaterThan(@PathVariable int points){
        return userService.getUsersGreaterThanPoints(points);
    }
}
