package estrutura_de_dados.mapa;

public class Exercicio2ContadorPalavras {
    public static void main(String[] args) {

String frase = "java java mapa lista mapa mapa";
String[] palavras = frase.split(" ");
MapaSimples<String, Integer> contagem = new MapaSimples<>(10);
for (int i = 0; i < palavras.length; i++) {
    Integer qtd = contagem.busca(palavras[i]);
    if (qtd == null) contagem.coloca(palavras[i], 1);
    else contagem.coloca(palavras[i], qtd + 1);
}
System.out.println(contagem);
    }
}
