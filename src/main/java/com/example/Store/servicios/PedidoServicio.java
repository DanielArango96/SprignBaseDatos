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

    public Pedido guardarPedido(Pedido pedido) throws Exception {
        try{
            if(!validacionPedido.validarFechaYHora(pedido.getFechaYHora().toLocalDate())){
                throw new Exception("Fecha Invalida, por favor verifique");
            }
            return pedidoRepositorio.save(pedido);

        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }



    public Pedido buscarPedidoPorID(Integer idPedido) throws Exception {
        try{
            if (pedidoRepositorio.findById(idPedido).isPresent()){
                return pedidoRepositorio.findById(idPedido).get();
            }else {
                throw new Exception("Marca no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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
