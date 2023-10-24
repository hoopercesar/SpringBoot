package com.hooperdevelopments.curso.Controllers;

import com.hooperdevelopments.curso.dao.UsuarioDao;
import com.hooperdevelopments.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
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
