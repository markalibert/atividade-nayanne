package estrutura_de_dados.lista_encadeada;

public class Exercicio8Agenda {
    public static void main(String[] args) {

ListaEncadeada<String> contatos = new ListaEncadeada<>();
contatos.adiciona("Ana - 83999990001"); contatos.adiciona("Bruno - 83999990002");
contatos.adiciona("Carla - 83999990003"); contatos.adiciona("Davi - 83999990004");
contatos.adiciona("Eva - 83999990005"); contatos.adiciona("Fabio - 83999990006");
System.out.println("Antes: " + contatos);
contatos.removeInicio();
contatos.removeFim();
System.out.println("Depois: " + contatos);
System.out.println("Restaram: " + contatos.tamanho());
    }
}
