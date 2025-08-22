package exerc101;

import java.util.Scanner;

public class Cateto {
    public static void main(String[] args) {
        double cateto1;
        double cateto2;

        Scanner input = new Scanner(System.in);
        System.out.print("Cateto 1: "); cateto1 = input.nextDouble();
        System.out.print("Cateto 2: "); cateto2 = input.nextDouble();

        double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2));

        System.out.printf("hipotenusa = %.2f", hipotenusa);
    }
}