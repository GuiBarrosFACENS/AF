package com.projects.praticandoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Livros;

public interface livrosRepository extends JpaRepository<Livros, Long> {
	Livros findByNome(String nome);
}
