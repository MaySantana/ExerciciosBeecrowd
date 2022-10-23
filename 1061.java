//Cálculo de Tempo, Java
//May Santana, 2022

import java.io.IOException;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {
   
    Scanner entrada = new Scanner(System.in);
   
    String dia_1 = entrada.nextLine();
    String dia_1_horario = entrada.nextLine();
   
    String[] dia_1_split = dia_1.split(" ");
    String[] dia_1_horario_split = dia_1_horario.split(" : ");

    String dia_2 = entrada.nextLine();
    String dia_2_horario = entrada.nextLine();
   
    String[] dia_2_split = dia_2.split(" ");
    String[] dia_2_horario_split = dia_2_horario.split(" : ");

    int dia_1_dia = Integer.parseInt(dia_1_split[1]);
   
    int dia_1_hora = Integer.parseInt(dia_1_horario_split[0]);
    int dia_1_minutos = Integer.parseInt(dia_1_horario_split[1]);
    int dia_1_segundos = Integer.parseInt(dia_1_horario_split[2]);
 
    int dia_2_dia = Integer.parseInt(dia_2_split[1]);
 
    int dia_2_hora = Integer.parseInt(dia_2_horario_split[0]);
    int dia_2_minutos = Integer.parseInt(dia_2_horario_split[1]);
    int dia_2_segundos = Integer.parseInt(dia_2_horario_split[2]);
   
    dia_1_segundos = (dia_1_dia * 24 * 60 * 60) + (dia_1_hora * 60 * 60) + (dia_1_minutos * 60) + (dia_1_segundos);
   
    dia_2_segundos = (dia_2_dia * 24 * 60 * 60) + (dia_2_hora * 60 * 60) + (dia_2_minutos * 60) + (dia_2_segundos);
   
    int  diferenca_segundos = dia_2_segundos - dia_1_segundos;
   
    int diferenca_segundos_atual = diferenca_segundos;
   
    int dias = diferenca_segundos_atual / (24 * 60 * 60);
    diferenca_segundos_atual -= dias * 24 * 60 * 60;
   
    int horas = diferenca_segundos_atual / (60 * 60);
    diferenca_segundos_atual -= horas * 60 * 60;
 
    int minutos = diferenca_segundos_atual / (60);
    diferenca_segundos_atual -= minutos * 60;
   
    int segundos = diferenca_segundos_atual;
   
    System.out.printf("%s dia(s)\n", dias);
    System.out.printf("%s hora(s)\n", horas);
    System.out.printf("%s minuto(s)\n", minutos);
    System.out.printf("%s segundo(s)\n", segundos);
   
  }
}
