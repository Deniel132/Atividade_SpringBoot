package dev.teste.RestauranteDeTeste.service;

import dev.teste.RestauranteDeTeste.controller.ComidaController;
import dev.teste.RestauranteDeTeste.model.Comida;
import dev.teste.RestauranteDeTeste.repository.ComidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComidaService {


	private final ComidaRepository comidaRepository;

	public ComidaService(ComidaRepository comidaRepository) {
		this.comidaRepository = comidaRepository;
	}

	public List<Comida> getAll(){return comidaRepository.findAll();}

	public Comida salvar(Comida comida){return comidaRepository.save(comida);}

	public void deletar(Long id){comidaRepository.deleteById(id);}
}
