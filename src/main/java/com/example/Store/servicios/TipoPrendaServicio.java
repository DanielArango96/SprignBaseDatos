package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionTipoPrenda;
import com.example.Store.modelos.TipoPrenda;
import com.example.Store.repositorios.TipoPrendaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPrendaServicio {
    @Autowired
    ValidacionTipoPrenda validacionTipoPrenda;

    @Autowired
    TipoPrendaRepositorio tipoPrendaRepositorio;
    public TipoPrenda guardarTipoPrenda (){
        return null;
    }


    public TipoPrenda  buscarTipoPrendaPorID(){
        return null;
    }

    //consultar todos los usuarios
    public List<TipoPrenda > buscarTodosLosTipoPrenda (){
        return null;
    }

    //editar un usuario
    public TipoPrenda  modificarTipoPrenda(){
        return null;
    }

    //Eliminar un usuario
    public boolean eliminarTipoPrenda (){
        return true;
    }
}
