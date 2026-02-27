package dev.teste.RestauranteDeTeste.repository;

import dev.teste.RestauranteDeTeste.model.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComidaRepository extends JpaRepository<Comida,Long> {
}
