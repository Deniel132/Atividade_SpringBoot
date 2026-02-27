package dev.teste.RestauranteDeTeste.controller;

import dev.teste.RestauranteDeTeste.model.ItemPedido;
import dev.teste.RestauranteDeTeste.model.Produto;
import dev.teste.RestauranteDeTeste.service.ItemPedidoService;
import dev.teste.RestauranteDeTeste.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")

public class ProdutoCrontroller {

	private final ProdutoService produtoService;

	public ProdutoCrontroller(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}

	@GetMapping
	public List<Produto> listarProduto(){return produtoService.getAll();}

	@PostMapping
	public Produto criarProduto(@RequestBody Produto produto){return produtoService.salvar(produto);}

	@DeleteMapping("/{id}")
	public void deletarProduto(@PathVariable()Long id){produtoService.deletar(id);}

}
