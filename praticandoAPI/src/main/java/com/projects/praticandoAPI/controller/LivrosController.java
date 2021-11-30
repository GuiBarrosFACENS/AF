package com.projects.praticandoAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.projects.praticandoAPI.modelo.Livros;
import com.projects.praticandoAPI.repository.livrosRepository;

public class LivrosController {
	@Autowired
	private livrosRepository livrosRepository;
	
	@GetMapping
	public ResponseEntity<List<Livros>> findAll() {
		List<Livros> list = livrosRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
