package dev.teste.RestauranteDeTeste.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tabela_produtos")
@Data
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

}
