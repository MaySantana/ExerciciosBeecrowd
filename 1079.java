//Médias Ponderadas, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner(System.in);
	    
	    double n1, n2, n3;
	    
		int test_cases;
		
		test_cases = scan.nextInt();
		
		for (int i = 0; i < test_cases; i++){
		    
		    n1 = scan.nextDouble();
		    n2 = scan.nextDouble();
		    n3 = scan.nextDouble();
		    
		    double media = ((n1 * 2) + (n2 * 3) + (n3 * 5))/10;
		    
		    System.out.printf("%.1f\n", media);
		    
		}
	}
}
