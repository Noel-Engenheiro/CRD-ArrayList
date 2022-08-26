package aczg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Criandotarefas {
	public static void main(String[] args) {
		
		
	 
		
		int opcao = 0;
			 
		
		try (Scanner sc = new Scanner(System.in)) {
			List<Tarefas> ListaDeTarefas = new ArrayList <>();    
			
				while (opcao != -1) {
						System.out.println("Escolha a opção do Menu\n" + "1 Criar Tarefa\n" + "2 Listar Todas as tarefas\n" + "3 Listar por status\n" + "4 Listar por prioridade\n" + "5 Listar por categoria\n" + "6 Remover tarefas\n");
						opcao = sc.nextInt();
							     
					   
					     
				
				switch (opcao) {
						 
						 case 1: //listar tarefas 
							 Tarefas tarefa = new Tarefas();	
							 
								System.out.println("Informe o nome da Tarefa: ");
								String nomeLido = sc.next();
								tarefa.setNome(nomeLido);
								  
								System.out.println("De 1 à 5 qual é o nível da prioridade da Tarefa: ");
								int p = sc.nextInt();
							    tarefa.setPrioridade(p);
								  
							    System.out.println("Qual é o Status da Tarefa: ");
								String a = sc.next();
								tarefa.setStatus(a);
							
								System.out.println("Qual é a Categoria da Tarefa: ");
								String C = sc.next();
								tarefa.setCategoria(C);
							   
								
								ListaDeTarefas.add(tarefa);
							    
							break;	
				
						 case 2: //listar todos
							 System.out.println("Listando todas as " +  ListaDeTarefas.size() + "tarefas sem filtrar por nada");
							 
							  for (Tarefas t : ListaDeTarefas) {
								 
						     System.out.println("Tarefas"+ t.getNome() + "prioridade: " + t.getPrioridade().toString());
						     
						     
						     break;		 
					 }
						 case 3: // listar por status
							 

						     System.out.println("Digite o nome do Status: \n" + "1 To do\n" + "2 Working in progress\n" + "3 Done");
							 String at1 = sc.next();
							 Atributo.Listarporstatus(ListaDeTarefas, at1);
							 
							 
							 break;	 
							 
						 case 4: // listar por prioridade
							 
							 System.out.println("Digite o número da prioridade:\n" + "1\n" + "2 \n" + "3 \n" + "4 \n" + "5 \n");
							 Integer p1 = sc.nextInt();
							 Atributo.Listarporprioridade(ListaDeTarefas, p1);
							 
							 		  
							 
							 break;	
						 case 5:  // listar por categoria

						     System.out.println("Digite a categoria: \n"+ "Básica\n"+ "Intermediária\n"  + "Avançada\n");
							 String ca = sc.next();
							 Atributo.ListarporCategoria(ListaDeTarefas, ca); 
							 break;	
						 case 6: // Deletar Tarefas
							 
							 
						System.out.println("Informe o status da tarefa a ser removida: \\n" + "1 To do\n" + "2 Working in progress\n" + "3 Done");
						String buscaTarefa =  sc.next();
						
						for (int i = 0; i < ListaDeTarefas.size(); i++){
							if(ListaDeTarefas.get(i).nome == buscaTarefa);
							ListaDeTarefas.remove(i);
						}
									
							
							 break;	
						 case 7:
							 Collections.sort(ListaDeTarefas, Collections.reverseOrder());
								
								for (Tarefas r : ListaDeTarefas) {
									System.out.println(r);
								}
								break;
								
						 case -1 : //Sair 
							 System.out.println("Saindo da Aplicação");
						 opcao = -1; 
						 break;
						
						 }
					
					 }
		}
			 
			 }
			
			
	

	}




