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

    public Marca guardarMarca(Marca marca) throws Exception {
        try{
            if(!validacionMarca.validarNombreMarca(marca.getNombreMarca())){
                throw new Exception("Nombre Invalido, por favor verifique");
            }
            if(!validacionMarca.validarNit(marca.getNit())){
                throw new Exception("Nit Invalido, por favor verifique");
            }
            if(!validacionMarca.validarAno(marca.getAnoCreacion())){
                throw new Exception("Año Invalido, por favor verifique");
            }
            return marcaRepositorio.save(marca);

        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }



    public Marca buscarMarcaPorId(Integer idMarca) throws Exception {
        try{
            if (marcaRepositorio.findById(idMarca).isPresent()){
                return marcaRepositorio.findById(idMarca).get();
            }else {
                throw new Exception("Marca no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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
