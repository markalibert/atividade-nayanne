package estrutura_de_dados.mapa;

public class MapaSimples<K, V> {
    private Object[] chaves;
    private Object[] valores;
    private int tamanho;

    public MapaSimples(int capacidade) {
        chaves = new Object[capacidade];
        valores = new Object[capacidade];
        tamanho = 0;
    }

    public void coloca(K chave, V valor) {
        for (int i = 0; i < tamanho; i++) {
            if (chaves[i].equals(chave)) {
                valores[i] = valor;
                return;
            }
        }
        if (tamanho < chaves.length) {
            chaves[tamanho] = chave;
            valores[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Mapa cheio!");
        }
    }

    public V busca(K chave) {
        for (int i = 0; i < tamanho; i++) {
            if (chaves[i].equals(chave)) return (V) valores[i];
        }
        return null;
    }

    public void remove(K chave) {
        for (int i = 0; i < tamanho; i++) {
            if (chaves[i].equals(chave)) {
                for (int j = i; j < tamanho - 1; j++) {
                    chaves[j] = chaves[j + 1];
                    valores[j] = valores[j + 1];
                }
                tamanho--;
                chaves[tamanho] = null;
                valores[tamanho] = null;
                return;
            }
        }
    }

    public int tamanho() { return tamanho; }

    public K chave(int posicao) { return (K) chaves[posicao]; }
    public V valor(int posicao) { return (V) valores[posicao]; }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < tamanho; i++) {
            resultado += chaves[i] + " -> " + valores[i] + "\n";
        }
        return resultado;
    }
}
