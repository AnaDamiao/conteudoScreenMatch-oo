package src.br.com.screenmatch.model;

import src.br.com.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    private String diretor;

    @Override
    public int getClassificacao(){
        return (int) pegaMedia() / 2;
    }
}
