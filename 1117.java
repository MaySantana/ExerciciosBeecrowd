//Leitura de notas, Java
//May Santana, 2022

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
       
        double notas[] = new double[2];
        int cont = 0;
       
        double nota;
      
        while (cont <= 1) {
            nota = input.nextDouble();
       
            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                notas[cont++] = nota;
            }
           
        }
       
        double media = (notas[0] + notas[1]) / 2;
       
        System.out.println("media = " + String.format("%.2f", media));
      
    }
}
