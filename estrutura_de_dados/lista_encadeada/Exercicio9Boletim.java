package estrutura_de_dados.lista_encadeada;

public class Exercicio9Boletim {
    public static void main(String[] args) {

ListaEncadeada<String> notas = new ListaEncadeada<>();
notas.adiciona("Matematica - 8.0"); notas.adiciona("Portugues - 7.5");
notas.adiciona("Historia - 9.0"); notas.adiciona("Geografia - 8.5");
notas.adiciona("Java - 10.0");
System.out.println("Notas: " + notas);
System.out.println("Posicao 1: " + notas.busca(1));
notas.remove(1);
System.out.println("Tem Java? " + notas.contem("Java - 10.0"));
System.out.println("Depois da remocao: " + notas);
System.out.println("Total: " + notas.tamanho());
    }
}
