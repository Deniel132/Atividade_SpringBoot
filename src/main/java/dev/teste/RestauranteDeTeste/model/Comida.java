package dev.teste.RestauranteDeTeste.model;

import jakarta.persistence.*;


import java.time.LocalDate;

@Entity
@Table(name = "TabelaDeComida")
public class Comida {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private Integer quantidade;
	private LocalDate dataValidade;

	public Comida() {

	}

	public Comida(Long id, String nome, Integer quantidade, LocalDate dataValidade) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.dataValidade = dataValidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		this.dataValidade = dataValidade;
	}
}
