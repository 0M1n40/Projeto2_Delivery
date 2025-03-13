package com.generation.projetoDelivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.projetoDelivery.model.Categoria;
import com.generation.projetoDelivery.model.Usuario;
import com.generation.projetoDelivery.repository.UsuarioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/all")
	public ResponseEntity<List<Usuario>> getAll() {

		return ResponseEntity.ok(usuarioRepository.findAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable Long id) {
		return usuarioRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}
	
	 @PostMapping("/cadastrar")
	    public ResponseEntity<Usuario> post(@Valid @RequestBody Usuario usuario){
	        return ResponseEntity.status(HttpStatus.CREATED)
	                .body(usuarioRepository.save(usuario));
	    }
	

	@PutMapping
	public ResponseEntity<Usuario> put(@Valid @RequestBody Usuario usuario) {
		if (!usuarioRepository.existsById(usuario.getId())) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		Usuario usuarioAtualizado = usuarioRepository.save(usuario);
		return ResponseEntity.status(HttpStatus.OK).body(usuarioAtualizado);
	}

}
