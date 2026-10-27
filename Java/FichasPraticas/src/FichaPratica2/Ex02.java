package FichaPratica2;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, taxa;
        System.out.print("Introduza o valor do seu sálario anual: ");
        salario = input.nextDouble();
        if(salario <= 15000) {
            taxa = salario * 0.2;
            System.out.println("A taxa a pagar tem o valor de: " +  taxa);
        }
        else{
            taxa = salario * 0.3;
            System.out.println("A taxa a pagar tem o valor de: " +  taxa);
        }
    }
}
