package com.projectspring.projectcourse.resources;

import com.projectspring.projectcourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value  = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "Maria@gmail.com", "98999999", "teste");
        return ResponseEntity.ok().body(u); //retornar resposta e corpo da resposta(u)
    }
}
