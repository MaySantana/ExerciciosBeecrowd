//Números Crescentes e Decrescentes, Java
//May Santana, 2022

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int X, Y;

        Scanner input = new Scanner(System.in);

        do {

            X = input.nextInt();
            Y = input.nextInt();

            if (X > Y) {
                System.out.print("Decrescente\n");
            } else if (X < Y) {
                System.out.print("Crescente\n");
            }
        } while (X != Y);
    }
}
