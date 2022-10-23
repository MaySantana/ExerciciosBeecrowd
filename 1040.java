//Média Ponderada entre quatro números, Java
//May Santana, 2022

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
    
		Scanner leitor = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
    
		double N1 = leitor.nextDouble();
		double N2 = leitor.nextDouble();
		double N3 = leitor.nextDouble();
		double N4 = leitor.nextDouble();
    
    double MEDIA = ((N1*2) + (N2*3) + (N3*4) + (N4*1)) / 10;
    
		System.out.println("Media: " + df.format(MEDIA));
    
        if (MEDIA >= 7) {
        	System.out.println("Aluno aprovado.");
        } else if (MEDIA < 7 && MEDIA >= 5) {
        	System.out.println("Aluno em exame.");
        	double NExame = leitor.nextDouble();
			System.out.println("Nota do exame: " + df.format(NExame));
        	MEDIA = (MEDIA + NExame) / 2;
        	if (MEDIA >= 5) {
            	System.out.println("Aluno aprovado.");
        	} else {
            	System.out.println("Aluno reprovado.");
        	}
			System.out.println("Media final: " + df.format(MEDIA));
        } else {
        	System.out.println("Aluno reprovado.");
        }
	}
}
