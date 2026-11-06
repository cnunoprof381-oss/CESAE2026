package FichaPraticaExtra_Loop;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, maior = 0, menor = 0;
        System.out.println("Imprima um numero: ");
        num = input.nextInt();
        if (num != 0) {
            maior = num;
            menor = num;
        }

        while (num != 0) {
            System.out.print("Imprima um numero: ");
            num = input.nextInt();
            if (num != 0) {
                if (num > maior) {
                    maior = num;
                }
                    if (num < menor) {
                        menor = num;
                    }
                }
            }


        System.out.print("Maior = " + maior + " Menor = " + menor);

    }
}
