package estrutura_de_dados.lista_encadeada;

public class Exercicio5Tarefas {
    public static void main(String[] args) {

ListaEncadeada<String> tarefas = new ListaEncadeada<>();
tarefas.adiciona("Estudar - alta"); tarefas.adiciona("Lavar louca - baixa");
tarefas.adiciona("Fazer trabalho - alta"); tarefas.adiciona("Comprar pao - media");
tarefas.adiciona("Arrumar quarto - baixa"); tarefas.adiciona("Ler livro - media");
tarefas.adiciona("Estudar Java - alta"); tarefas.adiciona("Organizar mesa - baixa");
System.out.println("Tarefas: " + tarefas);
System.out.println("Tem Estudar Java? " + tarefas.contem("Estudar Java - alta"));
System.out.println("Ultima tarefa: " + tarefas.ultimo());
System.out.println("Quantidade: " + tarefas.tamanho());
    }
}
