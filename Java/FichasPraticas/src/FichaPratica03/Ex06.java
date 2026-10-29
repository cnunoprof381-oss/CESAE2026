package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variaveis
        int num1, num2;

        // input reading
        System.out.print("Introduza um numero: ");
        num1 = input.nextInt();
        System.out.print("Introduza outro numero: ");
        num2 = input.nextInt();

        for (num1 = num1; num1 <= num2; num1++) {
            System.out.println(num1);
        }
    }
}