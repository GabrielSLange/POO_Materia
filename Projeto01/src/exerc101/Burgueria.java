package exerc101;

import java.util.Scanner;

public class Burgueria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdHamburger;
        int qtdHamburgerEspecial;
        int qtdBatataFrita;
        int qtdSuco;

        System.out.println("Hamburguer = R$ 15,00.\nHamburguer especial = R$ 20,00.\nBatata Frita = R$8,00.\nSuco = R$ 9,00.\n\n");

        System.out.println("Informe a quantidade de:");
        System.out.println("Hamburger ?"); qtdHamburger = input.nextInt();
        System.out.println("Hambuguer especial ?"); qtdHamburgerEspecial = input.nextInt();
        System.out.println("Batata Frita ?"); qtdBatataFrita = input.nextInt();
        System.out.println("Suco ?"); qtdSuco = input.nextInt();

        System.out.println("Hamburguer Hamburguer especial Batata Frita Suco Total a pagar");

        float valorTotal = (qtdHamburger * 15.0f) + (qtdHamburgerEspecial * 20.0f) + (qtdBatataFrita * 8.0f) + (qtdSuco * 9.0f);

        System.out.printf("%.2f    x    %.2f    x %.2f    x    %.2f    x    %.2f", (qtdHamburger * 15.0f), (qtdHamburgerEspecial * 20.0f), (qtdBatataFrita * 8.0f), (qtdSuco * 9.0f), valorTotal);
    }
} // Exercício de fixação - condicional - próximo exercicio que tenho que fazer