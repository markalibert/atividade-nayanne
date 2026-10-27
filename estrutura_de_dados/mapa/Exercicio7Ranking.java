package estrutura_de_dados.mapa;

public class Exercicio7Ranking {
    public static void main(String[] args) {

MapaSimples<String, Integer> jogadores = new MapaSimples<>(10);
jogadores.coloca("Ana", 100); jogadores.coloca("Bruno", 250);
jogadores.coloca("Carla", 180); jogadores.coloca("Davi", 300);
jogadores.coloca("Ana", 220);
String melhorJogador = "";
int maiorPontos = -1;
for (int i = 0; i < jogadores.tamanho(); i++) {
    if (jogadores.valor(i) > maiorPontos) {
        maiorPontos = jogadores.valor(i);
        melhorJogador = jogadores.chave(i);
    }
}
System.out.println("Ranking:");
System.out.println(jogadores);
System.out.println("Maior pontuacao: " + melhorJogador + " - " + maiorPontos);
    }
}
