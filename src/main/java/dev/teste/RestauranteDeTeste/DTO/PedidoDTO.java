package dev.teste.RestauranteDeTeste.DTO;

import lombok.Data;

import java.util.List;

@Data
public class PedidoDTO {

	private Long idCliente;
	private List<ItemPedidoDTO> listaItemPedidoDTO;


}
