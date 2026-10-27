package estrutura_de_dados.lista_encadeada;

public class Exercicio2Playlist {
    public static void main(String[] args) {

ListaEncadeada<String> playlist = new ListaEncadeada<>();
playlist.adiciona("The Cranberries  - Linger "); playlist.adiciona("O vento - Los Hemanos");
playlist.adiciona("Brand New Start - Little Joy"); playlist.adiciona("Esquadros - Adriana Calcanhoto");
playlist.adiciona("Retrato Pra Iaiá - Los Hermanos"); playlist.adiciona("Let it be - The Beatles");
System.out.println("Playlist: " + playlist);
System.out.println("Tem Musica 3? " + playlist.contem("Musica 3 - Artista C"));
System.out.println("Total de musicas: " + playlist.tamanho());
    }
}
