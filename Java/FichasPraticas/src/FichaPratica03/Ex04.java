package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.println("Insira um numero: ");
        num1 = input.nextInt();
        for(int i = 0; i <= num1; i++) System.out.println(i);
    }
}
