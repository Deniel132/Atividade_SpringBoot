package dev.teste.RestauranteDeTeste.controller;

import dev.teste.RestauranteDeTeste.DTO.ItemPedidoDTO;
import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.service.ItemPedidoService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/itempedido")

public class ItemPedidoController {

	private final ItemPedidoService itemPedidoService;

	public ItemPedidoController(ItemPedidoService comidaService) {
		this.itemPedidoService = comidaService;
	}

	@GetMapping
	public List<ItemPedido> listarItenPedido(){return itemPedidoService.getAll();}

	@PostMapping
	public ItemPedido criarItemPedido(@RequestBody List<ItemPedidoDTO> itemPedidoDTO){
		return itemPedidoService.salvar(itemPedidoDTO);

	}

	@DeleteMapping("/{id}")
	public void deletarItemPedido(@PathVariable()Long id){
		itemPedidoService.deletar(id);}

}
