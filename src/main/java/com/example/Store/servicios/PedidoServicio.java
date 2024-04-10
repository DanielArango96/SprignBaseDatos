package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionPedido;
import com.example.Store.modelos.Pedido;
import com.example.Store.repositorios.PedidoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServicio {

    @Autowired
    ValidacionPedido validacionPedido;

    @Autowired
    PedidoRepositorio pedidoRepositorio;

    public Pedido guardarPedido(){
        return null;
    }


    public Pedido buscarPedidoPorID(){
        return null;
    }

    //consultar todos los usuarios
    public List<Pedido> buscarTodosLosPedido (){
        return null;
    }

    //editar un usuario
    public Pedido modificarPedido(){
        return null;
    }

    //Eliminar un usuario
    public boolean eliminarPedido(){
        return true;
    }
}
