package br.com.seteideias.cijava.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public ResponseEntity<?> getAllUser() {
        return ResponseEntity.ok("thats work!");
    }

}
