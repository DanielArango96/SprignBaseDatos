package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionUsuario;
import com.example.Store.modelos.Usuario;
import com.example.Store.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    //en los servicios debo inyectar las dependencias de
    //las validaciones y las consultas o repositorios
        @Autowired
        ValidacionUsuario validacionUsuario;
        @Autowired
        UsuarioRepositorio usuarioRepositorio;

        //En el servicio se crea un metodo para cada una de las consultas a realizar en BD

    //Guardar usuario
    public Usuario guardarUsuario(){
        return null;
    }

    //consultar usuario por ID
    public Usuario buscarUsuarioPorID(){
        return null;
    }

    //consultar todos los usuarios
    public List<Usuario> buscarTodosLosUsuarios(){
        return null;
    }

    //editar un usuario
    public Usuario modificarUsuario(){
        return null;
    }

    //Eliminar un usuario
    public boolean eliminarUsuario(){
        return true;
    }
}
