package estrutura_de_dados.lista_encadeada;

public class Exercicio3Compras {
    public static void main(String[] args) {

ListaEncadeada<String> compras = new ListaEncadeada<>();
compras.adiciona("Arroz - 2"); compras.adiciona("Feijao - 1"); compras.adiciona("Leite - 3");
compras.adiciona("Pao - 5"); compras.adiciona("Cafe - 1"); compras.adiciona("Acucar - 2");
compras.adiciona("Macarrao - 2");
System.out.println("Compras: " + compras);
System.out.println("Item na posicao 2: " + compras.busca(2));
System.out.println("Tem Cafe? " + compras.contem("Cafe - 1"));
System.out.println("Total: " + compras.tamanho());
    }
}
