package dev.teste.RestauranteDeTeste.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tabela_cliente")
@Data
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String telefone;



}
