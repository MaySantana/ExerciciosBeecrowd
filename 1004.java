//Produto de dois inteiros, Java
//May Santana, 2022

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
      
        int a, b, PROD;
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
      
        PROD = a * b;
      
        System.out.println("PROD = " + PROD);
        
    }
}
