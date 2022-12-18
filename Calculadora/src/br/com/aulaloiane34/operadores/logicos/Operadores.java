package br.com.aulaloiane34.operadores.logicos;

public final class Operadores {
    private final char adcao;
    private final char subtracao;
    private final char divisao;
    private final char multiplicacao;

    public Operadores(char adcao, char subtracao, char divisao, char multiplicacao) {
        this.adcao = adcao;
        this.subtracao = subtracao;
        this.divisao = divisao;
        this.multiplicacao = multiplicacao;
    }

    public char adcao() {
        return adcao;
    }

    public char subtracao() {
        return subtracao;
    }

    public char divisao() {
        return divisao;
    }

    public char multiplicacao() {
        return multiplicacao;
    }



}
