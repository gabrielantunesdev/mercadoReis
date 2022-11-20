package br.com.mercadoreis.mercadoreis.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mercadoreis.mercadoreis.entities.Categoria;

@Repository
public interface categoriaRepositorio extends JpaRepository<Categoria, Long> {

}