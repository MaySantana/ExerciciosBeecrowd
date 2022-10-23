//PUM, Java
//May Santana, 2022

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      
		Scanner leitor = new Scanner(System.in);
      
		int N = leitor.nextInt();
		int cont = 1;
      
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cont + " ");
				cont++;
			}
      
			System.out.println("PUM");
			cont++;
      
		}
  }
}
