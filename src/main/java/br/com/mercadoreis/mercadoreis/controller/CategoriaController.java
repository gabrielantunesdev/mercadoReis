package br.com.mercadoreis.mercadoreis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mercadoreis.mercadoreis.entities.Categoria;
import br.com.mercadoreis.mercadoreis.service.categoriaService;

@RestController
@RequestMapping(path = "/categorias")
public class CategoriaController {

	@Autowired
	private categoriaService service;
	
	@GetMapping
	public String inicio() {
		return "Começei";
	}
	
	@GetMapping(path = "/listateste")
	public ResponseEntity<List<String>> nomes(){
		List<String> verbos = new ArrayList<>();
		verbos.add("Correr");
		verbos.add("Pular");
		verbos.add("Sorrir");
		verbos.add("Voar");
		return ResponseEntity.ok().body(verbos);
	}
	
	@GetMapping(path = "/lista")
	public ResponseEntity<List<Categoria>> verTodos(){
		return ResponseEntity.ok().body(service.verTodos());
	}
	
	@PostMapping
	public Categoria adicionar(Categoria categoria) {
		return service.adicionar(categoria);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Categoria> verPorId(@PathVariable long id) {
		return service.verPorId(id);
	}
}
