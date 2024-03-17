package com.example.SpringSecurityJWT.controllers.request;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestRolesController {

    @GetMapping("/accesAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String accesAdmin() {
        return "Tu ROL es ADMIN";
    }

    @GetMapping("/accesUser")
    @PreAuthorize("hasRole('USER')")
    public String accesUser() {
        return "Tu ROL es USER";
    }
   @GetMapping("/accesInvited")
   @PreAuthorize("hasRole('INVITED')")
     public String accesInvited() {
         return "Tu ROL es INVITED";
     }
}
