package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, perms, calc, ans;
        String operacao = "";
        perms = 0;
        while(perms == 0){
            System.out.print("Insira dois numeros: ");
            num1 = input.nextInt();
            num2 = input.nextInt();
            System.out.println("Insira uma operação: (+) (-) (/) (*)");
            operacao = input.next();
            switch(operacao){
                case "+":
                    calc = num1 + num2;
                    System.out.print("\n" + calc);
                    break;
                case "-":
                    calc = num1 - num2;
                    System.out.print("\n" + calc);
                    break;
                case "/":
                    calc = num1 / num2;
                    System.out.print("\n" + calc);
                    break;
                case "*":
                    calc = num1 * num2;
                    System.out.print("\n" + calc);
                    break;
                default:
                    System.out.println("Operação invalida");
            }
            System.out.println("\nQuer repetir? 0: Sim 1: Não");
            ans = input.nextInt();
            if(ans != 0){
                perms = 1;
            }
        }

    }
}
