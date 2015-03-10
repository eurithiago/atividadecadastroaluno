<%@page import="br.ucdb.cadastroaluno.Aluno"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alunos Cadastrados</title>
</head>
<body>

	<%
		//Scriptlet
		//Variavel já criada fazendo referencia ao requeste que fez o forward
		List<Aluno> alunoList = (List<Aluno>)request.getAttribute("aluno");
		
		for(Aluno a : alunoList){
			out.print("Aluno: " + a.getNome());
			out.print("<br>");
			out.print("CPF: " + a.getCpf());
			out.print("<br>");
			out.print("RG: " + a.getRg());
			out.print("<br>");
			if(a.getSexo()=="m"){
				out.print("Sexo : Masculino");
			}else
				out.print("Sexo: Feminino");
			out.print("<br>");
			out.print("Estado: " + a.getEstado());
			out.print("<br>");
			}
			
		
	%>

</body>
</html>