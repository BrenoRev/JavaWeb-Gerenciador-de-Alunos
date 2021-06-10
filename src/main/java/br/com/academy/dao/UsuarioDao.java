package br.com.academy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.academy.model.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{

}
