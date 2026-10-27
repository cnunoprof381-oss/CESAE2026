package FichaPratica2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A, B, calculo;
        System.out.print("Introduza dois numeros: ");
        A = input.nextDouble();
        B = input.nextDouble();
        System.out.println("Introduza a operação que pretende realizar: ");
        String operacao = input.next();

        switch(operacao){
            case "+":
                calculo = A + B;
                System.out.println("= " + calculo);
                break;
            case "-":
                calculo = A - B;
                System.out.println("= " + calculo);
                break;
            case "/":
                calculo = A / B;
                System.out.println("= " + calculo);
                break;
            case "*":
                calculo = A * B;
                System.out.println("= " + calculo);
                break;
            default:
                System.out.println("Por favor selecione uma operação válida");

        }


    }
}