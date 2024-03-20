package hu.flow.user.service;

import hu.flow.user.model.Users;
import hu.flow.user.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
   private UserRepository userRepository;


    public Users addUser(Users users){
       return userRepository.save(users);
    }

    public List<Users> findByName(String name){
        return userRepository.findByName(name);
    }

    public Users addUsers(Users users){
        return userRepository.save(users);
    }
    
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public List<Users> listUsers(){
       return userRepository.findAll();
    }

    public List<Users> getUsersByName(String name){
        return userRepository.findByName(name);
    }

    public List<Users> getUsersGreaterThanPoints(){
        return userRepository.findByPointsGreaterThan(500);
    }

    public Users updateUser(Users users){
        return userRepository.save(users);
    }

    public List<Users> getUsersGreaterThanPoints(int points){
        return userRepository.findByPointsGreaterThan(points);
    }
}
