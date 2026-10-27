package FichaPratica2;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, nota200, nota100, nota50, nota20, nota10, nota5;
        System.out.print("Escolha um numero multiplo de 5: ");
        num = input.nextInt();
        if(num % 5 != 0){
            System.out.println("O numero escolhido não é multiplo de 5");
            return;
        }

        nota200 = num / 200;
        num = num % 200;
        nota100 = num / 100;
        num = num % 100;
        nota50 = num / 50;
        num = num % 50;
        nota20 = num /20;
        num = num % 20;
        nota10 = num / 10;
        num = num % 10;
        nota5 = num / 5;

        System.out.print("200: " + nota200 + "\n100: " + nota100 + "\n50: " + nota50 + "\n20: " + nota20 + "\n10: " + nota10 + "\n5: " + nota5);

    }
}
