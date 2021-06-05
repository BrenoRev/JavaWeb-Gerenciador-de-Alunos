package br.com.academy.Enums;

public enum Curso {

	ADMINISTRACAO("Administração"),
	INFORMATICA("Informática"),
	LOGISTICA("Logística"),
	PROGRAMAÇÃO("Programação"),
	ENFERMAGEM("Enfermagem");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso = curso;
	}
	
	
}
