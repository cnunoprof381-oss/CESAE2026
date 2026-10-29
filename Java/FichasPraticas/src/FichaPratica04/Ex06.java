package FichaPratica04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, guess;
        guess = 0;
        System.out.print("Jogador 1, insira um numero de 0 a 100: ");
        num = input.nextInt();
        while(num > 100 || num < 0){
            System.out.print("Insira um valor valido.\n");
            System.out.print("Jogador 1, insira um numero de 0 a 100: ");
            num = input.nextInt();
        }
        while(num != guess){
            System.out.println("Jogador 2, insira o seu palpite: ");
            guess = input.nextInt();
            if(guess > 100 || guess < 0){
                System.out.println("Insira um valor valido");
            }
        }
        System.out.println("ACERTOU!!");
    }
}

