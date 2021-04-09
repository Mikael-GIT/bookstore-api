package com.mikael.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mikael.bookstore.domain.Categoria;

//Informando para o spring que estamos criando uma interface repository
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
