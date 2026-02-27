package dev.teste.RestauranteDeTeste.repository;

import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
