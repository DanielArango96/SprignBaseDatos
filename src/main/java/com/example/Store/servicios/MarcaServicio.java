package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionMarca;
import com.example.Store.modelos.Marca;
import com.example.Store.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServicio {

    @Autowired
    ValidacionMarca validacionMarca;

    @Autowired
    MarcaRepositorio marcaRepositorio;

    public Marca guardarMarca(){
        return null;
    }


    public Marca buscarMarcaPorID(){
        return null;
    }

    //consultar todos los usuarios
    public List<Marca> buscarTodasLasMarcas (){
        return null;
    }

    //editar un usuario
    public Marca modificarMarca(){
        return null;
    }

    //Eliminar un usuario
    public boolean eliminarMarca(){
        return true;
    }
}
