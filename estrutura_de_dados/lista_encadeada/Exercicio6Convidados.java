package estrutura_de_dados.lista_encadeada;

public class Exercicio6Convidados {
    public static void main(String[] args) {

ListaEncadeada<String> convidados = new ListaEncadeada<>();
convidados.adiciona("Ana - CPF 111"); convidados.adiciona("Bruno - CPF 222");
convidados.adiciona("Carla - CPF 333"); convidados.adiciona("Davi - CPF 444");
convidados.adiciona("Eva - CPF 555"); convidados.adiciona("Fabio - CPF 666");
convidados.adicionaInicio("Marina - CPF 777");
convidados.adiciona(3, "Pedro - CPF 888");
System.out.println("Convidados: " + convidados);
System.out.println("Tem Carla? " + convidados.contem("Carla - CPF 333"));
System.out.println("Total: " + convidados.tamanho());
    }
}
