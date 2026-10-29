package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Insira dois numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = num1; i <= num2; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}