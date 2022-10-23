//Tempo do jogo, Java
//May Santana, 2022

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
		
int hInicial = scan.nextInt();
int hFinal = scan.nextInt();

if (hInicial > hFinal) { 
	System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
} else if (hFinal > hInicial) {
	System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
} else {
	System.out.println("O JOGO DUROU 24 HORA(S)");
}
    } 
}
