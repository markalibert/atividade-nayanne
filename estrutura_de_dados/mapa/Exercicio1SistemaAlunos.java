package estrutura_de_dados.mapa;

public class Exercicio1SistemaAlunos {
    public static void main(String[] args) {

MapaSimples<Integer, String> alunos = new MapaSimples<>(10);
alunos.coloca(101, "Ana"); alunos.coloca(102, "Bruno"); alunos.coloca(103, "Carla");
alunos.coloca(104, "Davi"); alunos.coloca(105, "Eva");
System.out.println("Aluno da matricula 103: " + alunos.busca(103));
alunos.remove(102);
System.out.println("Alunos cadastrados:");
System.out.println(alunos);
    }
}
