//Números Ímpares, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		x = scan.nextInt();
		
		int i;
		for (i = 1; i <= x; i = i + 2){
		    
		    System.out.printf("%d\n", i);
      
		}
	}
}
