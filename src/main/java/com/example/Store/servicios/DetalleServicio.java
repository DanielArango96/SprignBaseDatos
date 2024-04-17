package com.example.Store.servicios;

import com.example.Store.helpers.ValidacionDetalle;
import com.example.Store.modelos.Detalle;
import com.example.Store.modelos.Usuario;
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
    public Detalle guardarDetalle(Detalle detalle) throws Exception{
        try{
            if(!validacionDetalle.validarCostoTotal(detalle.getCostoTotal())){
                throw new Exception("Costo Invalido, por favor verifique");
            }
            if(!validacionDetalle.validarCantidadProductos(detalle.getCantidadProductos())){
                throw new Exception("Costo Invalido, por favor verifique");
            }
            return detalleRepositorio.save(detalle);

        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }


    public Detalle guardarDetalle(){
        return null;
    }


    public Detalle buscarDetallePorID(Integer idDetalle) throws Exception {
        try{
            if (detalleRepositorio.findById(idDetalle).isPresent()){
                return detalleRepositorio.findById(idDetalle).get();
            }else {
                throw new Exception("Detalle no encontrado");
            }
        }catch (Exception error){
           throw new Exception(error.getMessage());
        }
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
