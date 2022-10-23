//Divisão entre dois números, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	  int test_cases;
		double x, y;
		
		Scanner scan = new Scanner(System.in);
		
		test_cases = scan.nextInt();
		
		for (int i = 0; i < test_cases; i++){
		    x = scan.nextDouble();
		    y = scan.nextDouble();
		    if (y == 0){
		        System.out.println("divisao impossivel");
		    } else {
		        System.out.printf("%.1f\n", (x/y));
		    }
		}
	}
}
