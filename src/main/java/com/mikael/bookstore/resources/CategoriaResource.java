package com.mikael.bookstore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mikael.bookstore.domain.Categoria;
import com.mikael.bookstore.services.CategoriaService;

@RestController
//localhost:8080/categorias -> Se eu quiser buscar uma categoria por um ID, o primeiro endpoint será o /categorias/ e depois o "id".
@RequestMapping(value ="/categorias")
public class CategoriaResource {
	//A classe Resource é responsável por fazer os endpoints pra receber os métodos HTTP.
	
	@Autowired
	private CategoriaService service;
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer id){
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}