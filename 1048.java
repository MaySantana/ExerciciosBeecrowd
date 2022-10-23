//Aumento de Salário, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salary;
		
		salary = scan.nextDouble();
		
		if (salary > 0 && salary <= 400){
		    double reajuste1 = (salary * 0.15);
		    double salary1 = (salary + reajuste1);
		    System.out.printf("Novo salario: %.2f\n", salary1);
		    System.out.printf("Reajuste ganho: %.2f\n", reajuste1);
		    System.out.println("Em percentual: 15 %");
		} else if (salary > 400 && salary <= 800){
		    double reajuste2 = (salary * 0.12);
		    double salary2 = (salary + reajuste2);
		    System.out.printf("Novo salario: %.2f\n", salary2);
		    System.out.printf("Reajuste ganho: %.2f\n", reajuste2);
		    System.out.println("Em percentual: 12 %");
		} else if (salary > 800 && salary <= 1200){
		    double reajuste3 = (salary * 0.1);
		    double salary3 = (salary + reajuste3);
		    System.out.printf("Novo salario: %.2f\n", salary3);
		    System.out.printf("Reajuste ganho: %.2f\n", reajuste3);
		    System.out.println("Em percentual: 10 %");
		} else if (salary > 1200 && salary <= 2000){
		    double reajuste4 = (salary * 0.07);
		    double salary4 = (salary + reajuste4);
		    System.out.printf("Novo salario: %.2f\n", salary4);
		    System.out.printf("Reajuste ganho: %.2f\n", reajuste4);
		    System.out.println("Em percentual: 7 %");
		} else if (salary > 2000){
		    double reajuste5 = (salary * 0.04);
		    double salary5 = (salary + reajuste5);
		    System.out.printf("Novo salario: %.2f\n", salary5);
		    System.out.printf("Reajuste ganho: %.2f\n", reajuste5);
		    System.out.println("Em percentual: 4 %");
		}
	}
}
