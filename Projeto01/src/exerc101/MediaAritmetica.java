package exerc101;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota1;
        double nota2;
        double trabalho1;
        double trabalho2;
        double trabalho3;
        double trabalhoFinal;


        System.out.print("nota 1: "); nota1 = input.nextDouble();
        System.out.print("nota 2: "); nota2 = input.nextDouble();
        System.out.print("trabalho 1: "); trabalho1 = input.nextDouble();
        System.out.print("trabalho 2: "); trabalho2 = input.nextDouble();
        System.out.print("trabalho 3: "); trabalho3 = input.nextDouble();
        System.out.print("trabalho Final: "); trabalhoFinal = input.nextDouble();

        double mediaNotas = ((nota1 + nota2) / 2) * 0.6;
        double mediaTrabalhos = ((trabalho1 + trabalho2 + trabalho3) / 3) * 0.2;

        System.out.printf("Nota Final = %.2f", (mediaNotas + mediaTrabalhos + (trabalhoFinal * 0.2)));
    }
}
