//Soma de dois inteiros, Java
//May Santana, 2021

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
      
        int a, b, SOMA;
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
      
        SOMA = a + b;
      
        System.out.println("SOMA = " + SOMA);
        
    }
}
