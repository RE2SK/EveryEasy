package de.resasimy.EveryEasy.ReConnect.Controller;

import de.resasimy.EveryEasy.ReConnect.Entity.UserData;
import de.resasimy.EveryEasy.ReConnect.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/reconnect/user")
    public ResponseEntity<UserData> registerUser(@RequestBody UserData userData) {
        return new ResponseEntity<>(userRepository.save(userData), HttpStatus.CREATED);
    }

    @PutMapping("/reconnect/user")
    public ResponseEntity<UserData> editUser(@RequestBody UserData userData) {
        return new ResponseEntity<>(userRepository.save(userData), HttpStatus.CREATED);
    }

    @GetMapping("/reconnect/user/{userId}")
    public ResponseEntity<Optional<UserData>> getUserById(@PathVariable String userId) {
        return new ResponseEntity<>(userRepository.findById(userId), HttpStatus.OK);
    }
}
