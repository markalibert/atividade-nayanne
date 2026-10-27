package estrutura_de_dados.lista_encadeada;

public class Exercicio7Estoque {
    public static void main(String[] args) {

ListaEncadeada<String> produtos = new ListaEncadeada<>();
produtos.adiciona("Arroz - R$ 25 - qtd 10"); produtos.adiciona("Feijao - R$ 8 - qtd 15");
produtos.adiciona("Cafe - R$ 16 - qtd 8"); produtos.adiciona("Leite - R$ 6 - qtd 20");
produtos.adiciona("Acucar - R$ 5 - qtd 12");
System.out.println("Estoque: " + produtos);
System.out.println("Posicao 2: " + produtos.busca(2));
produtos.adiciona(2, "Macarrao - R$ 4 - qtd 9");
System.out.println("Existe cafe? " + produtos.contem("Cafe - R$ 16 - qtd 8"));
System.out.println("Primeiro: " + produtos.primeiro());
System.out.println("Ultimo: " + produtos.ultimo());
    }
}
