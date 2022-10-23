//Total pago, Java
//May Santana, 2022

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int code;
		int quant;
		
		code = scan.nextInt();
		quant = scan.nextInt();
		
		switch (code){
		    case 1:
		        double total1 = quant * 4;
		        System.out.printf("Total: R$ %.2f\n", total1);
		        break;
		    case 2:
		        double total2 = quant * 4.5;
		        System.out.printf("Total: R$ %.2f\n", total2);
		        break;
		    case 3:
		        double total3 = quant * 5;
		        System.out.printf("Total: R$ %.2f\n", total3);
		        break;
		    case 4:
		        double total4 = quant * 2;
		        System.out.printf("Total: R$ %.2f\n", total4);
		        break;
		    case 5:
		        double total5 = quant * 1.5;
		        System.out.printf("Total: R$ %.2f\n", total5);
		        break;
		}
	}
}
