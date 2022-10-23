//Experimento, Java
//May Santana, 2022

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
    
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    
    	int N = Integer.valueOf(leitor.readLine());
    	int totalCoelhos = 0;
    	int totalRatos = 0;
    	int totalSapos = 0;
    
    	for (int i = 0; i < N; i++) {
    		String info = leitor.readLine();
    		String[] infos = info.split(" ");
    		int Quantia = Integer.valueOf(infos[0]);
    		char Tipo = infos[1].toUpperCase().charAt(0);
        
    		switch (Tipo) {
	    		case 'C': totalCoelhos += Quantia; break;
	    		case 'R': totalRatos += Quantia; break;
	    		case 'S': totalSapos += Quantia; break;
    		}
    	}
    	
    	int totalCobaias = totalCoelhos + totalRatos + totalSapos;
    	double mediaCoelhos = (totalCoelhos * 100) / (double) totalCobaias;
    	double mediaRatos = (totalRatos * 100) / (double) totalCobaias;
    	double mediaSapos = (totalSapos * 100) / (double) totalCobaias;
    	System.out.println("Total: " + totalCobaias + " cobaias");
    	System.out.println("Total de coelhos: " + totalCoelhos);
    	System.out.println("Total de ratos: " + totalRatos);
    	System.out.println("Total de sapos: " + totalSapos);
    	System.out.println(String.format("Percentual de coelhos: %.2f", mediaCoelhos) + " %");
    	System.out.println(String.format("Percentual de ratos: %.2f", mediaRatos) + " %");
    	System.out.println(String.format("Percentual de sapos: %.2f", mediaSapos) + " %");
    
	}
}
