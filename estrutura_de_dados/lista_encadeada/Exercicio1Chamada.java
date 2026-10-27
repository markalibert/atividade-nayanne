package estrutura_de_dados.lista_encadeada;

public class Exercicio1Chamada {
    public static void main(String[] args) {

ListaEncadeada<String> alunos = new ListaEncadeada<>();
alunos.adiciona("Wesley - matricula 101"); alunos.adiciona("Marcos - matricula 102");
alunos.adiciona("Ander - matricula 103"); alunos.adiciona("João - matricula 104");
alunos.adiciona("Raquel do pequetrace - matricula 105");
System.out.println("Alunos: " + alunos);
System.out.println("Primeiro: " + alunos.primeiro());
System.out.println("Ultimo: " + alunos.ultimo());
System.out.println("Quantidade: " + alunos.tamanho());
    }
}
