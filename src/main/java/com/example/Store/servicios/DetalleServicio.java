package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionDetalle;
import com.example.Store.modelos.Detalle;
import com.example.Store.repositorios.DetalleRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleServicio {

    @Autowired
    ValidacionDetalle validacionDetalle;
    @Autowired
    DetalleRepositorio detalleRepositorio;


    public Detalle guardarDetalle(){
        return null;
    }


    public Detalle buscarDetallePorID(){
        return null;
    }

    //consultar todos los usuarios
    public List<Detalle> buscarTodosLosDetalles (){
        return null;
    }

    //editar un usuario
    public Detalle modificarDetalle(){
        return null;
    }

    //Eliminar un usuario
    public boolean eliminarDetalle(){
        return true;
    }
}
