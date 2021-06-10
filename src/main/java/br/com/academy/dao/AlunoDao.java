package br.com.academy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Aluno;

public interface AlunoDao extends JpaRepository<Aluno, Integer> {

	//Filtrar com JPQL
	// FILTRAR SOMENTE ATIVOS
	@Query("select a from Aluno a where a.status = 'ATIVO' ")
	public List<Aluno> findByStatusAtivos();
	
	@Query("select b from Aluno b where b.status = 'INATIVO' ")
	public List<Aluno> findByStatusInativos();
	
	@Query("select c from Aluno c where c.status = 'CANCELADO' ")
	public List<Aluno> findByStatusCancelados();
	
	@Query("select d from Aluno d where d.status = 'TRANCADO' ")
	public List<Aluno> findByStatusTrancados();

	// Achar por nome no index Pesquisar Aluno
	public List<Aluno> findByNomeContainingIgnoreCase(String nome);
	
	/*
	@Query("select e from Aluno e where e.nome ='' ")
	public List<Aluno> findByName(); */
}
