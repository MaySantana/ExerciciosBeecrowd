//Números Ímpares Consecutivos, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		x = scan.nextInt();
		
		int cont = 0;
		
		int i;
		for (i = x; cont < 6; i++){
		    
		    if (i % 2 != 0){
		        
		        System.out.printf("%d\n", i);
		        cont++;
          
		    }
		}
	}
}
