//Programa sobre coletar informações de um funcionário, Java
//May Santana, 2021

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number_employee;
		int work_hours;
		float amount_per_hour;
		
		number_employee = scan.nextInt();
		work_hours = scan.nextInt();
		amount_per_hour = scan.nextFloat();
		
		float aux = work_hours * amount_per_hour;
		
		System.out.println("NUMBER = " + number_employee);
		System.out.printf("SALARY = U$ %.2f\n", aux);
		
	}
}
