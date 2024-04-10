package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionProducto;
import com.example.Store.modelos.Producto;
import com.example.Store.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductoServicio {

    @Autowired
    ValidacionProducto validacionProducto;
    @Autowired
    ProductoRepositorio productoRepositorio;
    public Producto guardarProducto(){
        return null;
    }


    public Producto buscarProductoPorID(){
        return null;
    }

    //consultar todos los usuarios
    public List<Producto> buscarTodosLosProducto (){
        return null;
    }

    //editar un usuario
    public Producto modificarProducto(){
        return null;
    }

    //Eliminar un usuario
    public boolean eliminarProducto(){
        return true;
    }
}
