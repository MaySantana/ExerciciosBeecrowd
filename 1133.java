//Soma dos números não divisíveis por 5, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		int x, y;
    
		Scanner scan = new Scanner(System.in);
    
		x = scan.nextInt();
		y = scan.nextInt();
		
		if (x > y){
		    for (int i = y + 1; i < x; i++){
		        if (i % 5 == 2 || i % 5 == 3){
		            System.out.println(i);
		        }
		    }
		} else if (y > x){
		    for (int i = x + 1; i < y; i++){
		        if (i % 5 == 2 || i % 5 == 3){
		            System.out.println(i);
		        }
		    }
		}
	}
}
