package dev.teste.RestauranteDeTeste.service;

import dev.teste.RestauranteDeTeste.controller.ClienteCorontroller;
import dev.teste.RestauranteDeTeste.model.Cliente;
import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.repository.ClienteRepository;
import dev.teste.RestauranteDeTeste.repository.ItemPedidoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {


	private final ClienteRepository clienteRepository;

	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public List<Cliente> getAll(){return clienteRepository.findAll();}

	public Cliente salvar(Cliente cliente){return clienteRepository.save(cliente);}

	public void deletar(Long id){clienteRepository.deleteById(id);}

	public Cliente getById(Long idCliente) {
		Cliente cliente = this.clienteRepository.findById(idCliente).orElse(null);
		if (cliente == null){
			throw new EntityNotFoundException();
		}
		return cliente;
	}
}
