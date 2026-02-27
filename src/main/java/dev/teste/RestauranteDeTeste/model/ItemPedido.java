package dev.teste.RestauranteDeTeste.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "table_item_pedido")
@Data
public class ItemPedido {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private Produto Produto;

	private Integer quantidade;

	@ManyToOne
	@JoinColumn(name = "id_pedido")
	private Pedido pedido;

}
