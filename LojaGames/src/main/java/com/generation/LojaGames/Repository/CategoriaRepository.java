package com.generation.LojaGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.LojaGames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Long>{

	List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
