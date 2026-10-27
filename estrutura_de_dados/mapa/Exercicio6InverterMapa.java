package estrutura_de_dados.mapa;

public class Exercicio6InverterMapa {
    public static void main(String[] args) {

MapaSimples<Integer, String> mapa = new MapaSimples<>(5);
mapa.coloca(1, "A"); mapa.coloca(2, "B"); mapa.coloca(3, "C");
MapaSimples<String, Integer> invertido = new MapaSimples<>(5);
for (int i = 0; i < mapa.tamanho(); i++) {
    invertido.coloca(mapa.valor(i), mapa.chave(i));
}
System.out.println("Mapa original:");
System.out.println(mapa);
System.out.println("Mapa invertido:");
System.out.println(invertido);
    }
}
