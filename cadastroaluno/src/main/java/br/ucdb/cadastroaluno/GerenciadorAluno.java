package br.ucdb.cadastroaluno;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {

	private static List<Aluno> alunoList = new ArrayList<Aluno>();
	
	public void salvar(Aluno aluno){
		alunoList.add(aluno);
	}
	
	public List<Aluno> getAluno(){
		return alunoList;
	}
	
}
