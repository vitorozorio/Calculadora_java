package br.com.aulaloiane34.calc;


public class Calculo {

    private double num1,num2;
    private double Fim;

    public Calculo(double num1, double num2, double fim) {
        this.num1 = num1;
        this.num2 = num2;
        this.Fim = fim;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getFim() {
        return Fim;
    }

    public void setFim(double fim) {
        Fim = fim;
    }

    public static double soma(double n1, double n2){


       return n1 + n2;
    }

    public static double subtracao(double n1, double n2){


        return n1 - n2;
    }

    public static double divisao(double n1, double n2){


        return n1 / n2;
    }

    public static double multiplicacao(double n1, double n2 ){


        return n1 * n2;
    }



}
