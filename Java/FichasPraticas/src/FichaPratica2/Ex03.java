package FichaPratica2;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double salario, imposto;
        System.out.print("Introduza o seu salario anual: ");
        salario = input.nextDouble();

        if(salario <= 15000){
            imposto = salario * 0.2;
            System.out.println("O imposto a pagar tem o valor de: " + imposto + "€");
        }
        else if(salario > 15000 && salario <= 20000){
            imposto = salario * 0.3;
            System.out.println("O imposto a pagar tem o valor de: " + imposto + "€");
        }
        else if(salario > 20000 && salario <= 25000) {
            imposto = salario * 0.35;
            System.out.println("O imposto a pagar tem o valor de: " + imposto + "€");
        }
        else{
            imposto = salario * 0.40;
            System.out.println("O imposto a pagar tem o valor de: " + imposto + "€");
        }
    }
}
