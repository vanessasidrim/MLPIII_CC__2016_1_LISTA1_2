package br.unipe.mlpIII.modelo;

public class Professor {
	
	protected String nome;
	protected String matricula;
	protected String especializacao;
	
	public Professor(String nome,String matricula,String especializacao) {
		this.especializacao=especializacao;
		this.matricula=matricula;
		this.nome=nome;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

}
