package exerc101;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha = 1;

        while (escolha != 5){
            System.out.println("-------------MENU---------------");
            System.out.println("-------------1- SOMA------------");
            System.out.println("-------------2- SUBTRAÇÃO-------");
            System.out.println("-------------3- MULTIPLICAÇÃO---");
            System.out.println("-------------4- DIVISÃO---------");
            System.out.println("-------------5- FIM-------------");
            System.out.print("Digite uma opção: "); escolha = input.nextInt();

            if(escolha < 1 || escolha > 5){
                try {
                    System.out.println("ESCOLHA INVALIDA! Tente novamente!");
                    Thread.sleep(3000);

                    LimparTela();
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
            else if(escolha == 5){
                System.out.println("bye bye ...");
                try {
                    Thread.sleep(3000);
                    LimparTela();
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
            else
            {
                System.out.print("Informe um numero: "); double numero1 = input.nextDouble();
                System.out.print("Informe outro numero: "); double numero2 = input.nextDouble();
                if(escolha == 1){
                    System.out.printf("Resultado da soma: %.2f", numero1 + numero2);
                }
                else if(escolha == 2)
                {
                    System.out.printf("Resultado da subtração: %.2f", numero1 - numero2);
                }
                else if(escolha == 3)
                {
                    System.out.printf("Resultado da multiplicação: %.2f", numero1 * numero2);
                }
                else
                {
                    System.out.printf("Resultado da divisão: %.2f", numero1 / numero2);
                }
            }
        }
    }
    public static void LimparTela(){
        try
        {
            String SO = System.getProperty("os.name");

            if(SO.contains("Windows"))
            {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else
            {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }
        catch (IOException | InterruptedException e) {
            System.err.println("Erro ao tentar limpar o console: " + e.getMessage());
        }
    }
}
