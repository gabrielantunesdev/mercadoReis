package br.com.mercadoreis.mercadoreis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mercadoreis.mercadoreis.entities.Categoria;
import br.com.mercadoreis.mercadoreis.repositorio.categoriaRepositorio;

@Service
public class categoriaService {

	@Autowired
	private categoriaRepositorio repositorio;
	
    public Categoria adicionar(Categoria categoria) {
       return repositorio.save(categoria); 
    }
    
    public List<Categoria> verTodos() {
    	return repositorio.findAll();
    }
    
    public Optional<Categoria> verPorId(long id) {
    	return repositorio.findById(id);
    }
}
