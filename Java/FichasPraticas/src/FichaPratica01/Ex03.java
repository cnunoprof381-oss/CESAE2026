package FichaPratica01;

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double lado1, lado2, area, perimetro;

        //Leitura dos lados do retangulo

        System.out.print("A medida de um dos lados do retangulo: ");
        lado1 = input.nextDouble();
        System.out.print("A medida do outro lado do retangulo: ");
        lado2 = input.nextDouble();

        perimetro = 2.0 * (lado1 + lado2);
        area = lado1 * lado2;

        System.out.println("O perimetro é igual a: " + perimetro);
        System.out.println("A area é igual a: " + area);
    }
}
