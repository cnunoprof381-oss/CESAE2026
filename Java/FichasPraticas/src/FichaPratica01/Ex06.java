package FichaPratica01;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int valor1, valor2, temp;

        System.out.print("Insira o primeiro valor: ");
        valor1 = input.nextInt();
        System.out.print("Insira o segundo valor: ");
        valor2 = input.nextInt();
        System.out.println("A: " + valor1 + " B: " + valor2);
        temp = valor1;
        valor1 = valor2;
        valor2 = temp;
        System.out.println("A: " + valor1 + " B: " + valor2);
        valor2 = valor2 + valor1;
        valor1 = valor2 - valor1;
        valor2 = valor2 - valor1;
        System.out.println("A: " + valor1 + " B: " + valor2);








    }
}
