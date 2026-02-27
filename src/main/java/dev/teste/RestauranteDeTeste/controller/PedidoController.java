package dev.teste.RestauranteDeTeste.controller;

import dev.teste.RestauranteDeTeste.DTO.PedidoDTO;
import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.model.Pedido;
import dev.teste.RestauranteDeTeste.service.ItemPedidoService;
import dev.teste.RestauranteDeTeste.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	private final PedidoService pedidoService;

	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	@GetMapping
	public List<Pedido> listarPedido(){return pedidoService.getAll();}

	@PostMapping
	public Pedido criarPedido(@RequestBody PedidoDTO pedidoDTO){return pedidoService.salvar(pedidoDTO);}

	@DeleteMapping("/{id}")
	public void deletarPedido(@PathVariable()Long id){pedidoService.deletar(id);}


}
