package com.hooperdevelopments.curso.Controllers;

import com.hooperdevelopments.curso.dao.UsuarioDao;
import com.hooperdevelopments.curso.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method= RequestMethod.GET)
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

    @RequestMapping(value = "api/usuarios", method= RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method= RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario){
        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String hashed = argon2.hash(1, 1024, 1, usuario.getPassword());
        usuario.setPassword(hashed);
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuario23")
    public Usuario putUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("pepe");
        usuario.setApellido("soto");
        usuario.setEmail("pepe@email.com");
        usuario.setTelefono("21982996786");
        usuario.setPassword("pepesoto123");

        return usuario;
    }

    @RequestMapping(value = "api/usuarios/{id}", method= RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable Long id){
        usuarioDao.deleteUsuario(id);
    }
}
