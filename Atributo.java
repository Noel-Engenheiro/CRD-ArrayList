package aczg;

import java.util.List;

public class Atributo {
public static void Listarporstatus(List<Tarefas> ListaDeTarefas, String atributo ) {
	
	for(Tarefas tarefa : ListaDeTarefas) {
		
		if(atributo.equalsIgnoreCase("todo")) {
		System.out.println(tarefa);
		} else if(atributo.equalsIgnoreCase("working in progress")) {
			System.out.println(tarefa);
		} else if(atributo.equalsIgnoreCase("done")) {
			System.out.println(tarefa);
		} else {
			System.out.println("Inválido");
		}
	
	}
	
}
public static void ListarporCategoria(List<Tarefas> ListaDeTarefas, String Categoria ) {
	
	for(Tarefas tarefa : ListaDeTarefas) {
		
		if(Categoria.equalsIgnoreCase("Básica")) {
		System.out.println(tarefa );
		} else if(Categoria.equalsIgnoreCase("Intermediária")) {
			System.out.println(tarefa );
		} else if(Categoria.equalsIgnoreCase("Avançada")) {
			System.out.println(tarefa);
		} else {
			System.out.println("Inválido");
		}
	
	}
	
}
public static void Listarporprioridade(List<Tarefas> ListaDeTarefas, Integer prioridade ) {
	
	for(Tarefas tarefa : ListaDeTarefas) {
		
		if(prioridade == 1) {
		System.out.println(tarefa + "prioridade 1");
		} else if(prioridade == 2) {
			System.out.println(tarefa + "prioridade 2");
		} else if(prioridade == 3) {
			System.out.println(tarefa + "prioridade 3");
		} else if(prioridade == 4) {
			System.out.println(tarefa + "prioridade 4");
		} else if(prioridade == 5) {
			System.out.println(tarefa + "prioridade 5");
		} else {
			System.out.println("Inválido");
		}
	
	}
	
}
}