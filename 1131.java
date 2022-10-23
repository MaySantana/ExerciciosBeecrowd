//Campeonato, Java
//May Santana, 2022

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
      
		Scanner leitor = new Scanner(System.in);
      
		int golsInter;
		int golsGremio;
		int flag = 1;
		int totalJogos = 0;
		int vitoriasGremio = 0;
		int vitoriasInter = 0;
		int empates = 0;
		
		while (flag == 1) {
      
			totalJogos++;
			golsInter = leitor.nextInt();
			golsGremio = leitor.nextInt();
      
			if (golsInter > golsGremio) vitoriasInter++;
			else if (golsGremio > golsInter) vitoriasGremio++;
			else empates++;
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			flag = leitor.nextInt();
      
			while (flag != 1 && flag != 2) {
        
				System.out.println("Novo grenal (1-sim 2-nao)");
				flag = leitor.nextInt();
        
			}
		}
		
		System.out.println(totalJogos + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);
      
		if (vitoriasInter > vitoriasGremio) System.out.println("Inter venceu mais");
		else if (vitoriasGremio > vitoriasInter) System.out.println("Gremio venceu mais");
		else System.out.println("Nao houve vencedor");
      
    }
}
