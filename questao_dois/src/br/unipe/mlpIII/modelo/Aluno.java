package br.unipe.mlpIII.modelo;


public class Aluno {
	protected String nome;
	protected double media;
	protected String matricula;
	protected int faltas;
	public Aluno(String nome,double media,String matricula,int faltas) {
		this.nome=nome;
		this.media=media;
		this.matricula=matricula;
		this.faltas=faltas;
		// TODO Auto-generated constructor stub
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}





public String toString() {
	// TODO Auto-generated method stub
	return "matricula: "+matricula+" nome: "+ nome+" media: "+media+"\n";
}






}
