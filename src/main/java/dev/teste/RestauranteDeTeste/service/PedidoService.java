package dev.teste.RestauranteDeTeste.service;

import dev.teste.RestauranteDeTeste.DTO.ItemPedidoDTO;
import dev.teste.RestauranteDeTeste.DTO.PedidoDTO;
import dev.teste.RestauranteDeTeste.model.Cliente;
import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.model.Pedido;
import dev.teste.RestauranteDeTeste.model.Produto;
import dev.teste.RestauranteDeTeste.repository.ItemPedidoRepository;
import dev.teste.RestauranteDeTeste.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PedidoService {


	private final PedidoRepository pedidoRepository;
	private final ClienteService clienteService;
	private final ItemPedidoService itemPedidoService;

	public PedidoService(PedidoRepository pedidoRepository, ClienteService clienteService, ItemPedidoService itemPedidoService) {
		this.pedidoRepository = pedidoRepository;
		this.clienteService = clienteService;
		this.itemPedidoService = itemPedidoService;
	}

	public List<Pedido> getAll(){return pedidoRepository.findAll();}

	public Pedido salvar(PedidoDTO pedidoDTO){

		Cliente cliente = clienteService.getById(pedidoDTO.getIdCliente());

		Map<Long, Integer> mapProdutoIdQuantidade = pedidoDTO.getListaItemPedidoDTO().stream()
				.collect(Collectors.toMap(
						ItemPedidoDTO::getIdProduto,
						ItemPedidoDTO::getQuantidade
				));

		List<ItemPedido> itemsPedido = this.itemPedidoService.construirListaItemPedido(mapProdutoIdQuantidade);

		Pedido pedido = new Pedido();
		pedido.setCliente(cliente);
		pedido.setListaItemPedido(itemsPedido);

		return pedidoRepository.save(pedido);
	}

	public void deletar(Long id){pedidoRepository.deleteById(id);}
}
