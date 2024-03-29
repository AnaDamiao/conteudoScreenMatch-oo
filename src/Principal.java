package src;

import src.br.com.screenmatch.calculos.CalculadoraDeTempo;
import src.br.com.screenmatch.calculos.FiltroRecomendacao;
import src.br.com.screenmatch.model.Episodio;
import src.br.com.screenmatch.model.Filme;
import src.br.com.screenmatch.model.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interestelar", 2014);
        meuFilme.setDuracaoEmMinutos(120);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie greysAnatomy = new Serie("Grey's Anatomy", 2005);
        greysAnatomy.exibeFichaTecnica();
        greysAnatomy.setTemporadas(20);
        greysAnatomy.setEpisodiosPorTemporada(25);
        greysAnatomy.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Grey's Anatomy: " + greysAnatomy.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(greysAnatomy);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(greysAnatomy);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

    }
}