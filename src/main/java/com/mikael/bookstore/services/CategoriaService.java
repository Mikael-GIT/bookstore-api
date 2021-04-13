package com.mikael.bookstore.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mikael.bookstore.domain.Categoria;
import com.mikael.bookstore.exceptions.ObjectNotFoundException;
import com.mikael.bookstore.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	//A classe service é responsável pelas regras de negócio e consultas no banco de dados.
	@Autowired
	private CategoriaRepository categoriaRepository;
	public Categoria findById(Integer id) {
		//O optional é para dar a opção de receber também um retorno nulo.
		Optional<Categoria> obj = categoriaRepository.findById(id);
		//Caso não encontre, retorne nulo.
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
}
