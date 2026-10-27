package FichaPratica01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2, soma, sub, mult, div; // Declaração das variaveis

        // Leitura das variaveis
        System.out.print("Introduza o primeiro numero: ");
        num1 = input.nextDouble();
        System.out.print("Introduza o segundo numero: ");
        num2 = input.nextDouble();

        // Operações
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;


        // Apresentação dos resultados
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + mult);
        System.out.println("A divisão é: " + div);


    }
}
