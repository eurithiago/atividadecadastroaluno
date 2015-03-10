package br.ucdb.cadastroaluno;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CadastroAlunosController")
public class CadastroAlunosController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		String cpf =  request.getParameter("cpf");
		String rg =  request.getParameter("rg");
		String sexo =  request.getParameter("sexo");
		String estado =  request.getParameter("estado");

		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		aluno.setCpf(cpf);
		aluno.setRg(rg);
		aluno.setSexo(sexo);
		aluno.setEstado(estado);
		
		GerenciadorAluno geral = new GerenciadorAluno();
		
		geral.salvar(aluno);

	}

}
