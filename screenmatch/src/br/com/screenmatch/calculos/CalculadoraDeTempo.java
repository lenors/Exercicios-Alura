package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    private int tempoTotal = 0;

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

public void inclui(Titulo titulo){
    this.tempoTotal += titulo.getDuracaoEmMinutos();
}
}
