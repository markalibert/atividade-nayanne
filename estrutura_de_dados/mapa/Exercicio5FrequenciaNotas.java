package estrutura_de_dados.mapa;

public class Exercicio5FrequenciaNotas {
    public static void main(String[] args) {

int[] notas = {7, 8, 7, 10, 8, 7};
MapaSimples<Integer, Integer> frequencia = new MapaSimples<>(10);
for (int i = 0; i < notas.length; i++) {
    Integer qtd = frequencia.busca(notas[i]);
    if (qtd == null) frequencia.coloca(notas[i], 1);
    else frequencia.coloca(notas[i], qtd + 1);
}
System.out.println(frequencia);
    }
}
