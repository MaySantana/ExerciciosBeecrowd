//Potência, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n;
		
		n = scan.nextInt();
		
		int i;
		for (i = 2; i <= n; i = i + 2){
      
		    System.out.println(i + "^2 = " + (i * i));
      
		}
  }
}
