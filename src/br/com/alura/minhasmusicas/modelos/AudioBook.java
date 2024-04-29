package br.com.alura.minhasmusicas.modelos;

public class AudioBook extends Audio implements Avaliavel{
    private int duracaoEmMinutos;

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int getClassificacao() {
        if(this.duracaoEmMinutos >= 150){
            return 7;
        } else {
            return 10;
        }
    }
}