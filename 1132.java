//Soma dos números não divisíveis de 13, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	  int soma = 0;
		int x, y;
		
		Scanner scan = new Scanner(System.in);
		
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (x > y){
		    for (int i = y; i <= x; i++){
		        if (i % 13 != 0){
		            soma += i;
		        }
		    }
		    
		    System.out.println(soma);
		    
		} else if (y > x){
		    for (int i = x; i <= y; i++){
		        if (i % 13 != 0){
		            soma += i;
		        }
		    }
		    
		    System.out.println(soma);
		    
		}
	}
}
