package FichaPratica01;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, valor;

        System.out.print("Preço do primeiro produto: ");
        preco1 = input.nextDouble();

        System.out.print("Preço do segundo produto: ");
        preco2 = input.nextDouble();

        System.out.print("Preço do terceiro produto: ");
        preco3 = input.nextDouble();

        valor = (preco1 + preco2 + preco3) * 0.9;
        System.out.println("Valor a pagar: " + valor);


    }
}
