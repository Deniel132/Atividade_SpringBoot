package dev.teste.RestauranteDeTeste.controller;

import dev.teste.RestauranteDeTeste.model.Cliente;
import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.service.ClienteService;
import dev.teste.RestauranteDeTeste.service.ItemPedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")

public class ClienteCorontroller {

	private final ClienteService clienteService;

	public ClienteCorontroller(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@GetMapping
	public List<Cliente> listarClientes(){return clienteService.getAll();}

	@PostMapping
	public Cliente criarCliente(@RequestBody Cliente cliente){return clienteService.salvar(cliente);}

	@DeleteMapping("/{id}")
	public void deletarCliente(@PathVariable()Long id){clienteService.deletar(id);}

}
