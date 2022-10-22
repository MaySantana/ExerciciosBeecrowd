//Resolver a seguinte expressão entre quatro números inseridos pelo usuário: (A * B - C * D), Java
//May Santana, 2022

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
      
        int a, b, c, d, DIFERENCA;
        Scanner scan = new Scanner(System.in);
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
      
        DIFERENCA = (a * b - c * d);
      
        System.out.println("DIFERENCA = " + DIFERENCA);
        
    }
}
