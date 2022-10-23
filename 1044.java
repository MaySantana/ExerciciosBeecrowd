//Múltiplos, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		if (a % b == 0 || b % a == 0){
		    System.out.println("Sao Multiplos");
		} else {
		    System.out.println("Nao sao Multiplos");
		}
  }
}
