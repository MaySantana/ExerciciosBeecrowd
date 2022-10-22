//Área de um Círculo, Java
//May Santana, 2022

import java.util.*;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) {
        
        double R;
        
        Scanner scan = new Scanner(System.in);
        
        R = scan.nextDouble();
        
        double A = AreaCirculo(R);
        
        System.out.printf("A=%.4f\n", A);
        
    }
    
    public static double AreaCirculo (double R) {
        
        double π = 3.14159;
        double A;
        
        A = π * R * R;
        
        return A;
        
    }  
}
