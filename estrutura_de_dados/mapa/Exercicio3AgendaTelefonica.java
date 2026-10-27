package estrutura_de_dados.mapa;

public class Exercicio3AgendaTelefonica {
    public static void main(String[] args) {

MapaSimples<String, String> agenda = new MapaSimples<>(10);
agenda.coloca("Ana", "83999990001"); agenda.coloca("Bruno", "83999990002");
agenda.coloca("Carla", "83999990003"); agenda.coloca("Davi", "83999990004");
System.out.println("Telefone da Carla: " + agenda.busca("Carla"));
agenda.remove("Bruno");
System.out.println("Agenda:");
System.out.println(agenda);
    }
}
