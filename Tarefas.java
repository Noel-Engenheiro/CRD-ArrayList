package aczg;

public class Tarefas {


 public String nome;
 public Integer prioridade;
 public String Categoria;
 public String Status;
 
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getCategoria() {
	return Categoria;
}
public void setCategoria(String categoria) {
	Categoria = categoria;
}
String getNome() {
	return this.nome;
}
void setNome(String novoNome) {
	this.nome = novoNome;
}
Integer getPrioridade() {
	return this.prioridade;
}
void setPrioridade(int novaPrioridade) {
	this.prioridade = novaPrioridade;
}
//definir a to string 

@Override
public String toString() {
return  "Nome: " + nome + ", Prioridade: " + prioridade + ", Atributo: " + Status + ", Categoria: " + Categoria ; 
	 
}

}


