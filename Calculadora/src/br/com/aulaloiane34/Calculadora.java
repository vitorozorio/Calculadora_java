package br.com.aulaloiane34;
import br.com.aulaloiane34.logica.Logica;
import br.com.aulaloiane34.calc.Calculo;
import java.util.Scanner;


public class Calculadora {

   public static void main (String[] args) {

       Scanner texto = new Scanner(System.in);
       Calculo Calcular = new Calculo(0,0,0);
       Logica Logica = new Logica('+','-','/','*');
       char indice;
       boolean verificadora = true;
       double numero1, numero2;
        

       do {
           
         numero1 = texto.nextDouble();
         Calcular.setNum1(numero1);
         indice = texto.next().charAt(0);
         numero2 = texto.nextDouble();
         Calcular.setNum2(numero2);
         
         if (indice == Logica.getAdcao()){
             
             System.out.println(Calculo.soma(numero1,numero2));
             
         } else if (indice == Logica.getSubtracao()) {
             
             System.out.println(Calculo.subtracao(numero1,numero2));
             
         } else if (indice == Logica.getMultiplicacao()) {

             System.out.println(Calculo.multiplicacao(numero1,numero2)); 
             
         } else if (indice == Logica.getDivisao()) {

             System.out.println(Calculo.divisao(numero1,numero2));

         }

              System.out.println("p para parar \nc para continuar");
              indice = texto.next().charAt(0);

             switch (indice) {

               case 'p' -> {
                   verificadora = false;
               }
               case 'c' -> {
                   verificadora = true;
               }

         }


       }
       while (verificadora);

   }
   
}
