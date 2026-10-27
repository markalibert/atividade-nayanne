package estrutura_de_dados.mapa;

public class Exercicio4ControleEstoque {
    public static void main(String[] args) {

MapaSimples<String, Integer> estoque = new MapaSimples<>(10);
estoque.coloca("Arroz", 10); estoque.coloca("Feijao", 15);
estoque.coloca("Cafe", 8); estoque.coloca("Leite", 20);
System.out.println("Vendendo 2 pacotes de arroz...");
estoque.coloca("Arroz", estoque.busca("Arroz") - 2);
System.out.println("Estoque atualizado:");
System.out.println(estoque);
    }
}
