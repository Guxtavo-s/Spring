package com.generation.FarmaciaGen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.FarmaciaGen.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}
