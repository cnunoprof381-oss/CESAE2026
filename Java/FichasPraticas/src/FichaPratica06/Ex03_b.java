package FichaPratica06;

import java.util.Scanner;

public class Ex03_b {
    public static boolean posNeg(int a){
        return (a >=0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira um numero: ");
        int numero = input.nextInt();
        if(posNeg(numero)) System.out.print("É numero positivo");
        else System.out.print("É numero negativo");

    }
}
