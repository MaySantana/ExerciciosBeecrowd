//Números Positivos e Negativos, Java
//May Santana, 2022

import java.util.Scanner;

public class Main{
    
   public static void main(String[] args){

      @SuppressWarnings("resource")
      
    Scanner sc = new Scanner(System.in);
    
      int p = 0 ;
      float vetor[] = new float[6];

      for(int c = 0 ; c <=5 ; c++){
         vetor[c] = sc.nextFloat();
                 if(vetor[c]>0){

            p++;
          
         }
      }

      System.out.printf("%d valores positivos\n", (p));  

   }
}
