package estrutura_de_dados.lista_encadeada;

public class Exercicio4Livros {
    public static void main(String[] args) {

ListaEncadeada<String> livros = new ListaEncadeada<>();
livros.adiciona("Dom Casmurro - Machado - 1899"); livros.adiciona("O Hobbit - Tolkien - 1937");
livros.adiciona("Capitaes da Areia - Jorge Amado - 1937"); livros.adiciona("A Hora da Estrela - Clarice - 1977");
livros.adiciona("O Alienista - Machado - 1882");
System.out.println("Livros: " + livros);
livros.adicionaInicio("Livro novo no inicio - Autor - 2020");
livros.adiciona("Livro novo no final - Autor - 2024");
System.out.println("Atualizado: " + livros);
System.out.println("Primeiro: " + livros.primeiro());
System.out.println("Ultimo: " + livros.ultimo());
    }
}
