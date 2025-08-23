package exerc101;

import java.util.Scanner;

public class PesoPlanetas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu peso na terra: "); double pesoTerra = input.nextDouble();


        System.out.println("1 - Mercurio - Gravidade Relativa: 0,37");
        System.out.println("2 - Vênus - Gravidade Relativa: 0,88");
        System.out.println("3 - Marte - Gravidade Relativa: 0,38");
        System.out.println("4 - Júpiter - Gravidade Relativa: 2,64");
        System.out.println("5 - Saturno - Gravidade Relativa: 1,15");
        System.out.println("6 - Urano - Gravidade Relativa: 1,17\n");
        System.out.print("Digite um numero para escolher o planeta: "); int escolhaPlaneta = input.nextInt();

        double pesoNoPlaneta;
        String nomePlaneta;
        switch (escolhaPlaneta) {
            case 1 -> {
                pesoNoPlaneta = pesoTerra / 10 * 0.37;
                nomePlaneta = "Mercurio";
            }
            case 2 -> {
                pesoNoPlaneta = pesoTerra / 10 * 0.88;
                nomePlaneta = "Vênus";
            }
            case 3 -> {
                pesoNoPlaneta = pesoTerra / 10 * 0.38;
                nomePlaneta = "Marte";
            }
            case 4 -> {
                pesoNoPlaneta = pesoTerra / 10 * 2.64;
                nomePlaneta = "Júpiter";
            }
            case 5 -> {
                pesoNoPlaneta = pesoTerra / 10 * 1.15;
                nomePlaneta = "Saturno";
            }
            case 6 -> {
                pesoNoPlaneta = pesoTerra / 10 * 1.17;
                nomePlaneta = "Urano";
            }
            default -> {
                pesoNoPlaneta = 0;
                nomePlaneta = "";
            }
        }

        if(pesoNoPlaneta == 0){
            System.out.println("Planeta escolhido é invalido");
        }
        else
        {
            System.out.printf("seu peso no planeta %s é %.2f kg", nomePlaneta, pesoNoPlaneta);
        }
    }
}
