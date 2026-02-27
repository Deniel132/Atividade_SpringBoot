package dev.teste.RestauranteDeTeste.controller;

import dev.teste.RestauranteDeTeste.model.Comida;
import dev.teste.RestauranteDeTeste.service.ComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/Comida")

public class ComidaController {


	@Autowired
	private final ComidaService comidaService;

	public ComidaController(ComidaService comidaService) {
		this.comidaService = comidaService;
	}

	@GetMapping
	public List<Comida> listarComidas(){return comidaService.getAll();}

	@PostMapping
	public Comida criarComida(@RequestBody Comida comida){return comidaService.salvar(comida);}

	@DeleteMapping("/{id}")
	public void deletarComida(@PathVariable()Long id){comidaService.deletar(id);}

}
