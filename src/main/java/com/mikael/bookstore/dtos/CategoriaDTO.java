package com.mikael.bookstore.dtos;

import java.io.Serializable;

import com.mikael.bookstore.domain.Categoria;

public class CategoriaDTO implements Serializable{
	//O padrão DTO serve para que quando um usuário queira buscar uma categoria no frotend não seja acessado diretamente
	    //todos os livros da categorias, mas sim apenas a categoria.
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private String descricao;
	public CategoriaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
