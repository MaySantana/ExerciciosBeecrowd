//Positivo, Negativo, Par, Ímpar, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		int test_cases;
		
		Scanner scan = new Scanner(System.in);
		
		test_cases = scan.nextInt();
		
		for (int i = 0; i < test_cases; i++){
		    
		    int number = scan.nextInt();
		    
		    if (number == 0){
		        System.out.println("NULL");
		    } else if (number > 0 && number % 2 == 0){
		        System.out.println("EVEN POSITIVE");
		    } else if (number > 0 && number % 2 != 0){
		        System.out.println("ODD POSITIVE");
		    } else if (number < 0 && number % 2 == 0){
		        System.out.println("EVEN NEGATIVE");
		    } else if (number < 0 && number % 2 != 0){
		        System.out.println("ODD NEGATIVE");
		    }
		}	
	}
}
