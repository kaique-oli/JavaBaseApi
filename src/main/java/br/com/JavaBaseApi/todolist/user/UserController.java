package br.com.JavaBaseApi.todolist.user;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel request){
        var user = this.userRepository.findByUsername(request.getUserName());
        var passCrypt = BCrypt.withDefaults().hashToString(12, request.getPassword().toCharArray());
        request.setPassword(passCrypt);
        if(user != null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Login já existe!");
        }else{
            var userCreated = this.userRepository.save(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
        }
    }
}
