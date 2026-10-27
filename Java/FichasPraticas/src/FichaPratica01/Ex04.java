package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double raio, pi, area;

        pi = 3.14;

        System.out.print("Insira o raio da circunferência: ");
        raio = input.nextDouble();
        area = pi * (raio * raio);
        System.out.println("A area da circunferência é: " + area);


    }
}
