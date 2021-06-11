package br.com.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;

@Entity
public class Aluno {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy ="increment")
	private Integer id;
	
	@Column(name ="nome")
	// Verifica se o campo não está vázio ou nulo
	@Size(min =5, max=35,message="O nome deve conter no mínimo 5 caracteres.")
	@NotBlank(message = "O nome não pode ser vázio.")
	private String nome;
	
	@Column(name="curso")
	@Enumerated(EnumType.STRING)
	@NotNull(message= "O campo curso não pode ser nulo.")
	private Curso curso;
	
	@Column(name="matricula")
	@NotNull(message = "Clique no botão 'Gerar'")
	@Size(min=3, message="Clique no botão gerar matricula!")
	private String matricula;
	
	@Column(name ="status")
	@Enumerated(EnumType.STRING)
	@NotNull(message = "O campo status não pode ser nulo.")
	private Status status;
	
	@NotBlank(message = "O turno não pode ser vázio.")
	@Size(min =4, message = "No mínimo 4 caracteres.")
	private String turno;
	
	public Aluno(Integer id, String nome, Curso curso, String matricula, Status status) {
		super();
		this.id = id;
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
		this.status = status;
	}

	public Aluno() {
		super();
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the turno
	 */
	public String getTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	

	/**
	 * @return the curso
	 */
	public Curso getCurso() {
		return curso;
	}


	/**
	 * @param curso the curso to set
	 */
	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
