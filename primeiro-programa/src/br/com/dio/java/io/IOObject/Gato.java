package br.com.dio.java.io.IOObject;

import java.io.Serializable;

//nome, idade, cor;
public class Gato implements Serializable {

	public static final long serialVersionUID = 3L; // abributo que serealiza a classe
	private String nome;
	private Integer idade;
	private String cor;
	private boolean castrado;
	private transient boolean ronrona; // transiente aqui serve para deixar esse atributo "invisível" para serealização

	public Gato() { // Construtor padrão

	}

	public Gato(String nome, Integer idade, String cor, boolean castrado, boolean ronrona) { // Construtor
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		this.castrado = castrado;
		this.ronrona = ronrona;
	}

	// Getters
	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public boolean isRonrona() {
		return ronrona;
	}

}
