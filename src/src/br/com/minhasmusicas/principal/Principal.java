package br.com.minhasmusicas.principal;

import br.com.minhasmusicas.modelos.MinhasPreferidas;
import br.com.minhasmusicas.modelos.Musica;
import br.com.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo( "Procuro Alguém ");
        minhaMusica.setCantor(" Djonga");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 500; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("PrimoTech");
        meuPodcast.setApresentador("Danilo");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
