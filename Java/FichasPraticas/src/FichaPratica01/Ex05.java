package FichaPratica01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, media, mediap;
        System.out.print("Insira o valor da primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Insira o valor da segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Insira o valor da terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("A media das notas é: " + media);

        mediap = (0.2 * nota1) + (0.3 * nota2) + (0.5 * nota3);
        System.out.println("O resultado da media ponderada: " + mediap);


    }
}
