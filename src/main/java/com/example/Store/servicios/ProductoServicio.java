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
    public Producto guardarProducto(Producto producto) throws Exception {
        try {
            if (!validacionProducto.validarNombre(producto.getNombreProducto())) {
                throw new Exception("Nombres Invalidos, por favor verifique");
            }
            if (!validacionProducto.validarDescripcion(producto.getDescripcion())) {
                throw new Exception("Descripcion Invalida, por favor verifique");
            }
            if (!validacionProducto.validarFotografia(producto.getFotografia())) {
                throw new Exception("URL invalido, por favor verifique");
            }
            if (!validacionProducto.validarTalla(producto.getTalla())) {
                throw new Exception("Talla Invalido, por favor verifique");
            }
            if (!validacionProducto.validarReferencia(producto.getReferencia())) {
                throw new Exception("Referencia Invalida, por favor verifique");
            }
            if (!validacionProducto.validarCantidadBodega(producto.getCantidadBodega())) {
                throw new Exception("Cantidad Invalida, por favor verifique");
            }
            return productoRepositorio.save(producto);


        } catch (Exception error) {
            throw new Exception(error.getMessage());

        }
    }



    public Producto buscarProductoPorID(Integer idProducto) throws Exception {
        try{
            if (productoRepositorio.findById(idProducto).isPresent()){
                return productoRepositorio.findById(idProducto).get();
            }else {
                throw new Exception("Marca no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
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
