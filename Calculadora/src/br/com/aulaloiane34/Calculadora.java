package br.com.aulaloiane34;
import br.com.aulaloiane34.operadores.logicos.Operadores;
import br.com.aulaloiane34.calc.Calculo;
import java.util.Scanner;


public class Calculadora {

   public static void main (String[] args) {

       Scanner texto = new Scanner(System.in);
       Operadores Operadores = new Operadores('+','-','/','*');
       char indice;
       boolean verificadora = true;
       double numero1, numero2;
        

       do {
           
         numero1 = texto.nextDouble();
         indice = texto.next().charAt(0);
         numero2 = texto.nextDouble();

         
         if (indice == Operadores.adcao()){
             
             System.out.println(Calculo.soma(numero1,numero2));
             
         } else if (indice == Operadores.subtracao()) {
             
             System.out.println(Calculo.subtracao(numero1,numero2));
             
         } else if (indice == Operadores.multiplicacao()) {

             System.out.println(Calculo.multiplicacao(numero1,numero2)); 
             
         } else if (indice == Operadores.divisao()) {

             System.out.printf("%.2f",Calculo.divisao(numero1,numero2));

         }

         System.out.println("\np para parar \nc para continuar");
         indice = texto.next().charAt(0);

             switch (indice) {

               case 'p' -> verificadora = false;

               case 'c' -> {
               }
         }


       }
       while (verificadora);

   }

}
