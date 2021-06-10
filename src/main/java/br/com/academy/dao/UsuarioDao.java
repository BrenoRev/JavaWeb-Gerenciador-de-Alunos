package br.com.academy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.academy.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{

	@Query("select i from Usuario i where i.email= :email")
	public Usuario findByEmail(String email);
	
	@Query("select j from Usuario j where j.user= :user and j.senha= :senha")
	public Usuario buscarLogin(String user, String senha);
}
