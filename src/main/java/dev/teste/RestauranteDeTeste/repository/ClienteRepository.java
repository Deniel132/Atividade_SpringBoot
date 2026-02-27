package dev.teste.RestauranteDeTeste.repository;

import dev.teste.RestauranteDeTeste.model.Cliente;
import dev.teste.RestauranteDeTeste.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
