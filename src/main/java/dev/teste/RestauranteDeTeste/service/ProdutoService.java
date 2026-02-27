package dev.teste.RestauranteDeTeste.service;

import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.model.Produto;
import dev.teste.RestauranteDeTeste.repository.ItemPedidoRepository;
import dev.teste.RestauranteDeTeste.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {


	private final ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public List<Produto> getAll(){return produtoRepository.findAll();}

	public Produto salvar(Produto produto){return produtoRepository.save(produto);}

	public void deletar(Long id){produtoRepository.deleteById(id);}

	public List<Produto> getAllByIds(List<Long> idsProdute) {
		return this.produtoRepository.findAllById(idsProdute);
	}
}
