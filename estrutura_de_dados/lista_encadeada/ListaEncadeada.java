package estrutura_de_dados.lista_encadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> fim;
    private int tamanho;

    public ListaEncadeada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void adiciona(T elemento) {
        No<T> novo = new No<>(elemento);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        tamanho++;
    }

    public void adicionaInicio(T elemento) {
        No<T> novo = new No<>(elemento);
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.proximo = inicio;
            inicio = novo;
        }
        tamanho++;
    }

    public void adiciona(int posicao, T elemento) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posicao invalida!");
            return;
        }
        if (posicao == 0) {
            adicionaInicio(elemento);
        } else if (posicao == tamanho) {
            adiciona(elemento);
        } else {
            No<T> atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            No<T> novo = new No<>(elemento);
            novo.proximo = atual.proximo;
            atual.proximo = novo;
            tamanho++;
        }
    }

    public T busca(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return null;
        }
        No<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.elemento;
    }

    public T primeiro() {
        if (inicio == null) return null;
        return inicio.elemento;
    }

    public T ultimo() {
        if (fim == null) return null;
        return fim.elemento;
    }

    public boolean contem(T elemento) {
        No<T> atual = inicio;
        while (atual != null) {
            if (atual.elemento.equals(elemento)) return true;
            atual = atual.proximo;
        }
        return false;
    }

    public void removeInicio() {
        if (inicio != null) {
            inicio = inicio.proximo;
            tamanho--;
            if (inicio == null) fim = null;
        }
    }

    public void removeFim() {
        if (inicio == null) return;
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            No<T> atual = inicio;
            while (atual.proximo != fim) atual = atual.proximo;
            atual.proximo = null;
            fim = atual;
        }
        tamanho--;
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posicao invalida!");
            return;
        }
        if (posicao == 0) {
            removeInicio();
        } else {
            No<T> atual = inicio;
            for (int i = 0; i < posicao - 1; i++) atual = atual.proximo;
            atual.proximo = atual.proximo.proximo;
            if (posicao == tamanho - 1) fim = atual;
            tamanho--;
        }
    }

    public void limpa() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public int tamanho() { return tamanho; }

    @Override
    public String toString() {
        String resultado = "[";
        No<T> atual = inicio;
        while (atual != null) {
            resultado += atual.elemento;
            if (atual.proximo != null) resultado += ", ";
            atual = atual.proximo;
        }
        return resultado + "]";
    }
}
