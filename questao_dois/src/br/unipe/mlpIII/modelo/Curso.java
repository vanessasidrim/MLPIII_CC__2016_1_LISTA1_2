package br.unipe.mlpIII.modelo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Curso {
	protected String nome;
	protected int numero;
	protected Professor professor;
	protected List<Aluno>alunos=new	ArrayList<Aluno>();
	
	public Curso(String nome,int numero,Professor professor) {
		this.nome=nome;
		this.numero=numero;
		this.professor=professor;
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
    public boolean removeraluno(String nome){
    	for(int i = 0; i < alunos.size(); i++){
    		Aluno aux= alunos.get(i); 
    	if((aux.getNome().equals(nome))||(aux.getMatricula().equals(nome))){
    	alunos.remove(aux);
    	return true;
    	}
    	}
    	return false;
    }
    
    public boolean verificar(String matricula){
    	for(int i = 0; i < alunos.size(); i++){
    		Aluno aux= alunos.get(i); 
    		if(aux.getMatricula().equals(matricula))
    		return true;
    	}
    	return false;
    }
    
    public void alunosAprovados(){
    	for(int i = 0; i < alunos.size(); i++){
    		Aluno aux= alunos.get(i); 
    		if(aux.getMedia()>=7){
    			System.out.println(aux);
    		}
    	}
    }
    public void alunosReprovados(){
    	for(int i = 0; i < alunos.size(); i++){
    		Aluno aux= alunos.get(i); 
    		if((aux.getMedia()<7)||(aux.getFaltas()>15)){
    			System.out.println(aux);
    			}
    		}
    	
    }
    public void listar(){
    	NomeComparator comparator= new NomeComparator();
    	Collections.sort(alunos,comparator);
    }
}
