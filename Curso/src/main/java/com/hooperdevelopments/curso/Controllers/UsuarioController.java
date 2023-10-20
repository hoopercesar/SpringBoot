package com.hooperdevelopments.curso.Controllers;

import com.hooperdevelopments.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("pepe");
        usuario.setApellido("soto");
        usuario.setEmail("pepe@email.com");
        usuario.setTelefono("21982996786");
        usuario.setPassword("pepesoto123");

        return usuario;
    }

    @RequestMapping(value = "usuario23")
    public Usuario putUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("pepe");
        usuario.setApellido("soto");
        usuario.setEmail("pepe@email.com");
        usuario.setTelefono("21982996786");
        usuario.setPassword("pepesoto123");

        return usuario;
    }


    @RequestMapping(value = "usuario456")
    public Usuario deleteUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("pepe");
        usuario.setApellido("soto");
        usuario.setEmail("pepe@email.com");
        usuario.setTelefono("21982996786");
        usuario.setPassword("pepesoto123");

        return usuario;
    }
}
