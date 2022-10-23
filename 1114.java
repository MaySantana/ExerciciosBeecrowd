//Validação de senha, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int senha;
		
		Scanner scan = new Scanner(System.in);
		
		senha = scan.nextInt();
		
		while (senha != 2002){
		    senha = scan.nextInt();
		    System.out.println("Senha Invalida");
		    if (senha == 2002){
		        System.out.println("Acesso Permitido");
		    }
		}
	}
}
