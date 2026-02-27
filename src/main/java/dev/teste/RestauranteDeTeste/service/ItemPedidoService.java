package dev.teste.RestauranteDeTeste.service;

import dev.teste.RestauranteDeTeste.DTO.ItemPedidoDTO;
import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.model.Produto;
import dev.teste.RestauranteDeTeste.repository.ItemPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class ItemPedidoService {


	private final ItemPedidoRepository itemPedidoRepository;
	private final ProdutoService produtoService;

	public ItemPedidoService(ItemPedidoRepository itemPedidoRepository, ProdutoService produtoService) {
		this.itemPedidoRepository = itemPedidoRepository;
		this.produtoService = produtoService;
	}

	public List<ItemPedido> getAll(){return itemPedidoRepository.findAll();}

	public ItemPedido salvar(List<ItemPedidoDTO> itemPedidoDTO){
		List<Long> idsProdute = itemPedidoDTO.stream().map(ItemPedidoDTO::getIdProduto).toList();

		return null;
	}

	public List<ItemPedido> construirListaItemPedido(Map<Long, Integer> mapProdutoQuantidade) {

		List<Produto> listaProdutos = this.produtoService.getAllByIds(new ArrayList<>(mapProdutoQuantidade.keySet()));


		return listaProdutos.stream()
				.map(produto -> {
					ItemPedido itemPedido = new ItemPedido();
					itemPedido.setProduto(produto);

					itemPedido.setQuantidade(mapProdutoQuantidade.getOrDefault(produto.getId(), 0));
					return itemPedido;
				})
				.collect(Collectors.toList());
	}


	public void deletar(Long id){itemPedidoRepository.deleteById(id);}
}
