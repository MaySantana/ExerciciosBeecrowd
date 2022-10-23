//Soma dos números ímpares, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
		int n1, n2, test_cases, soma;
		
		test_cases = scan.nextInt();
		
		for (int i = 0; i < test_cases; i++){
      
		    soma = 0;
		    n1 = scan.nextInt();
		    n2 = scan.nextInt();
      
		    if (n1 > n2){
		        for (int j = n2 + 1; j < n1; j++){
		            if (j % 2 != 0){
		                soma += j;
		            }
		        }
		    } else if (n2 > n1){
		        for (int j = n1 + 1; j < n2; j++){
		            if (j % 2 != 0){
		                soma += j;
		            }
		        }
		    }
		    
		    System.out.println(soma);
		    
		}
	}
}
