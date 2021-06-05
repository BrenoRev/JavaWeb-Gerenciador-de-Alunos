package br.com.academy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.academy.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

}
