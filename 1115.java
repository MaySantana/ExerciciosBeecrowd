//Localização de Coordenadas nos Quadrantes, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
		int x, y;
		
		do {
		    
		    x = scan.nextInt();
		    y = scan.nextInt();
		    
		    if (x > 0 && y > 0){
		        System.out.println("primeiro");
		    } else if (x < 0 && y > 0){
		        System.out.println("segundo");
		    } else if (x < 0 && y < 0){
		        System.out.println("terceiro");
		    } else if (x > 0 && y < 0){
		        System.out.println("quarto");
		    }
		    
		} while (x != 0 && y != 0);
    }
}
