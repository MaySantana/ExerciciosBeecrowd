//Taxa Salarial, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double salary;
		
		salary = scan.nextDouble();
		
		if (salary >= 0 && salary <= 2000) {
        	System.out.println("Isento");
        } else if (salary > 2000 && salary <= 3000) {
        	System.out.println(String.format("R$ %.2f", (salary - 2000) * 0.08));
        } else if (salary > 3000 && salary <= 4500) {
        	System.out.println(String.format("R$ %.2f", ((salary - 3000)  * 0.18) + 80));
        } else {
        	System.out.println(String.format("R$ %.2f", ((salary - 4500) * 0.28) + 350));
        }
	}
}
