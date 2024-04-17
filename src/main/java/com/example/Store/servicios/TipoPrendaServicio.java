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
    public TipoPrenda guardarTipoPrenda (TipoPrenda tipoPrenda) throws Exception {
        try {
            if (!validacionTipoPrenda.validarNombre(tipoPrenda.getNombre())) {
                throw new Exception("Nombres Invalidos, por favor verifique");
            }
            return tipoPrendaRepositorio.save(tipoPrenda);


        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }


    public TipoPrenda  buscarTipoPrendaPorID(Integer idTipoPrenda) throws Exception {
        try{
            if (tipoPrendaRepositorio.findById(idTipoPrenda).isPresent()){
                return tipoPrendaRepositorio.findById(idTipoPrenda).get();
            }else {
                throw new Exception("Marca no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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
