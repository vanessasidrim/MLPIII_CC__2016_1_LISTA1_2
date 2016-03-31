package br.unipe.mlpIII.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.unipe.mlpIII.modelo.Aluno;
import br.unipe.mlpIII.modelo.Curso;
import br.unipe.mlpIII.modelo.Professor;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		boolean aux=true;
		Professor professor=new Professor("kami","Oncologista","14579874");
		Curso cc=new Curso("oncologia",2,professor);
		List<Aluno> alunos= new ArrayList<Aluno>();
		
		while (aux){
			System.out.println("\n1) incluir alunos");
			System.out.println("2) remover alunos");
			System.out.println("3) Verificar se um aluno está matriculado (por matrícula)");
			System.out.println("4) Listar todos os alunos aprovados (média superior à 7,0)");
			System.out.println("5) Listar todos os alunos reprovados por falta (faltas superior à 15)");
			System.out.println("6) Listar por ordem alfabética\n");
			System.out.println("\nInforme a opcao:");
			
			int op= sc.nextInt();
			
			switch(op){
			case 1:{
				System.out.println("informe o nome : ");
				String asdf= sc.next();
	    		
				System.out.println("informe a matricula :");
				String matricula= sc.next();
				if(cc.verificar(matricula)){
					System.out.println("aluno ja cadastrado");
					break;
				}
					
	    		
				System.out.println("informe a media : ");
				double media=sc.nextDouble();
				
				System.out.println("informe o numero de faltas : ");
				int faltas=sc.nextInt();
				
				Aluno aluno=new Aluno(asdf,media,matricula,faltas);
				alunos.add(aluno);
				cc.setAlunos(alunos);
				
			break;
			}
			case 2:{
				System.out.println("informe o nome ou a matricula: ");
				String aux2 =sc.next();
				
				if(cc.removeraluno(aux2))
					System.out.println("removido");
				else
					System.out.println("não foi removido");
				break;
			}
			case 3:{
				System.out.println("informe a matricula :");
				String matricula= sc.next();
				
				if(cc.verificar(matricula))
					System.out.println("matriculado");
				else
					System.out.println("não esta matriculado");
				break;
			}
			case 4:{
				cc.alunosAprovados();
			break;
			}
			case 5:{
				cc.alunosReprovados();
			}
			case 6:{
				cc.listar();
				System.out.println(cc.getAlunos());
				break;
			}
			default:{
				System.out.println("opção invalida");
				break;
			}
			}
			
			
			
			
		}
sc.close();
	}

}
