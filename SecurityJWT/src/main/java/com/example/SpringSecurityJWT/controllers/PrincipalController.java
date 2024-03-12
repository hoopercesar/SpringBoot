package com.example.SpringSecurityJWT.controllers;

import com.example.SpringSecurityJWT.controllers.request.CreateUserDTO;
import com.example.SpringSecurityJWT.models.ERole;
import com.example.SpringSecurityJWT.models.RoleEntity;
import com.example.SpringSecurityJWT.models.UserEntity;
import com.example.SpringSecurityJWT.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class PrincipalController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String hello() {
        return "hola mundo sin seguridad";
    }
    @GetMapping("/helloAsegurado")
    public String helloAsegurado() {
        return "hola mundo con seguridad";
    }

    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@Valid @RequestBody CreateUserDTO createUserDTO){

        Set<RoleEntity> roles = createUserDTO.getRoles().stream()
                .map(role -> RoleEntity.builder()
                        .name(ERole.valueOf(role))
                        .build())
                .collect(Collectors.toSet());

        UserEntity userEntity = UserEntity.builder()
                .username(createUserDTO.getUsername())
                .password(createUserDTO.getPassword())
                .email(createUserDTO.getEmail())
                .roles(roles)
                .build();

        userRepository.save(userEntity);

        return ResponseEntity.ok(userEntity);
    }
    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String id) {
        userRepository.deleteById(Long.parseLong(id));
        return "se ha borrado usuario con id ".concat(id);
    }


}
