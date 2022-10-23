//Intervalo Numérico, Java
//May Santana, 2022

import java.util.Scanner;

public class Main {
    
	public static void main(String[] args){
	    
    	Scanner scan = new Scanner(System.in);
    	
    	int N = scan.nextInt();
    	int in = 0;
    	int out = 0;
    	
    	for (int i = 0; i < N; i++) {
    		int x = scan.nextInt();
    		if (x >= 10 && x <= 20) in++;
    		else out++;
    	}
    
    	System.out.println(in + " in");
    	System.out.println(out + " out");
    
    }
}
