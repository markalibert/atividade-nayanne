package estrutura_de_dados.lista_encadeada;

public class Exercicio10Filmes {
    public static void main(String[] args) {

ListaEncadeada<String> filmes = new ListaEncadeada<>();
filmes.adiciona("Titanic - Romance - 1997"); filmes.adiciona("Shrek - Animacao - 2001");
filmes.adiciona("Matrix - Ficcao - 1999"); filmes.adiciona("Avatar - Ficcao - 2009");
filmes.adiciona("Carros - Animacao - 2006");
System.out.println("Filmes: " + filmes);
filmes.adiciona(2, "Toy Story - Animacao - 1995");
System.out.println("Tem Matrix? " + filmes.contem("Matrix - Ficcao - 1999"));
filmes.remove(1);
System.out.println("Depois de remover: " + filmes);
filmes.limpa();
System.out.println("Depois de limpar: " + filmes);
System.out.println("Tamanho final: " + filmes.tamanho());
    }
}
