package br.unipe.mlpIII.modelo;

import java.util.Comparator;

public class NomeComparator implements Comparator<Aluno>{

	public int compare(Aluno aluno, Aluno outro) {
		return aluno.getNome().compareTo(outro.getNome());
	}

}
