package com.example.Store.repositorios;

import com.example.Store.modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PedidoRepositorio extends JpaRepository<Pedido,Integer> {
}
