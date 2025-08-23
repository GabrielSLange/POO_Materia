package exerc101;

import java.util.Scanner;

public class IdadeBilhete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade: "); int idade = input.nextInt();

        if(idade < 6){
            System.out.println("Isento de pagamento");
        }
        else if (idade < 13)
        {
            System.out.println("Bilhete de criança");
        }
        else if(idade < 65)
        {
            System.out.println("Bilhete normal");
        }
        else
        {
            System.out.println("Bilhete de 3ª idade");
        }
    }
}
