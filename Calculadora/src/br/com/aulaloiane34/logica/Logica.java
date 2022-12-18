package br.com.aulaloiane34.logica;

public class Logica {

    private char adcao;
    private char subtracao;
    private char divisao;
    private char multiplicacao;


    public Logica(char adcao, char subtracao, char divisao, char multiplicacao ) {
        this.adcao = adcao;
        this.subtracao = subtracao;
        this.divisao = divisao;
        this.multiplicacao = multiplicacao;
    }

    public char getAdcao() {
        return adcao;
    }


    public char getSubtracao() {
        return subtracao;
    }


    public char getDivisao() {
        return divisao;
    }


    public char getMultiplicacao() {
        return multiplicacao;
    }

}
