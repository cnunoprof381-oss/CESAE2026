package FichaPratica2;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2;

        System.out.print("Introduza o primeiro numero: ");
        num1 = input.nextDouble();
        System.out.print("Introduza o segundo numero: ");
        num2 = input.nextDouble();

        if(num1 > num2) {
            System.out.println("O primeiro é o maior");
        }
        else {
            System.out.println("O segundo numero é o maior");
        }

    }
}
