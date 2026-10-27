package FichaPratica2;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        String ordem;
        System.out.print("Selecione 3 numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.print("Escolha ordem decrescente(D) ou crescente(C): ");
        ordem = input.next();
        if(ordem.equals("d") || ordem.equals("D")){
            if(num1 > num2 && num1 > num3 && num2 > num3){
                System.out.print(num1 + " " + num2 + " " + num3);
            }else if(num1 > num2 && num1 > num3 && num3 > num2){
                System.out.print(num1 + " " + num3 + " " + num2);
            }else if(num2 > num1 && num2 > num3 && num1 > num3){
                System.out.print(num2 + " " + num1 + " " + num3);
            }else if(num2 > num1 && num2 > num3 && num3 > num1){
                System.out.print(num2 + " " + num3 + " " + num1);
            }else if(num3 > num1 && num3 > num2 && num1 > num2){
                System.out.print(num3 + " " + num1 + " " + num2);
            }else if(num3 > num1 && num3 > num2 && num2 > num1){
                System.out.print(num3 + " " + num2 + " " + num1);
            }
        } else if(ordem.equals("c") || ordem.equals("C")){
            if(num1 > num2 && num1 > num3 && num2 > num3){
                System.out.print(num3 + " " + num2 + " " + num1);
            }else if(num1 > num2 && num1 > num3 && num3 > num2){
                System.out.print(num2 + " " + num3 + " " + num1);
            }else if(num2 > num1 && num2 > num3 && num1 > num3){
                System.out.print(num3 + " " + num1 + " " + num2);
            }else if(num2 > num1 && num2 > num3 && num3 > num1){
                System.out.print(num1 + " " + num3 + " " + num2);
            }else if(num3 > num1 && num3 > num2 && num1 > num2){
                System.out.print(num2 + " " + num1 + " " + num3);
            }else if(num3 > num1 && num3 > num2 && num2 > num1){
                System.out.print(num1 + " " + num2 + " " + num3);
            }
        }
    }
}
