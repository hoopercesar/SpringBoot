package com.hooperdevelopments.curso.Controllers;

import com.hooperdevelopments.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario2 = new Usuario();
        usuario2.setId(111L);
        usuario2.setNombre("jorge");
        usuario2.setApellido("peres");
        usuario2.setEmail("jorge.peres@email.com");
        usuario2.setTelefono("9876545321");
        usuario2.setPassword("jorgeperes123");

        Usuario usuario = new Usuario();
        usuario.setId(321L);
        usuario.setNombre("pepe");
        usuario.setApellido("soto");
        usuario.setEmail("pepe@email.com");
        usuario.setTelefono("21982996786");
        usuario.setPassword("pepesoto123");

        Usuario usuario3 = new Usuario();
        usuario3.setId(132L);
        usuario3.setNombre("maria");
        usuario3.setApellido("gonzalez");
        usuario3.setEmail("maria.gon@email.com");
        usuario3.setTelefono("332244666789");
        usuario3.setPassword("mariagon333");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);


        return usuarios;
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
