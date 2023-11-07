package com.hooperdevelopments.curso.Controllers;

import com.hooperdevelopments.curso.dao.UsuarioDao;
import com.hooperdevelopments.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/login", method= RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){

        if (usuarioDao.verificarCredenciales(usuario)) {
            return "OK";
        }
        return "FAIL";
    }
}
