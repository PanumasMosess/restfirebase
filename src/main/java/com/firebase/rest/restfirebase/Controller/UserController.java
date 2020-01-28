package com.firebase.rest.restfirebase.Controller;

import com.firebase.rest.restfirebase.Objects.Person;
import com.firebase.rest.restfirebase.Service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class UserController {

    @Autowired
    FirebaseService firebaseService;

    @GetMapping("/getUserDetails")
    public Person getExample(@RequestHeader() String name) throws ExecutionException, InterruptedException {
        return firebaseService.getUserDetails(name);
    }

    @PostMapping("/createUser")
    public String postExample(@RequestBody Person person) throws ExecutionException, InterruptedException {
        return firebaseService.saveUserDataDetails(person);
    }

    @PutMapping("/updateUser")
    public String putExample(@RequestBody Person person) throws ExecutionException, InterruptedException {
        return firebaseService.updateUserDetail(person);
    }

    @DeleteMapping("/deleteUser")
    public String deleteExample(@RequestHeader String name){
        return firebaseService.deleteUser(name);
    }
}
