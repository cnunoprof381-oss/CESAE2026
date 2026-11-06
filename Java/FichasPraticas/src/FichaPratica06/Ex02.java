package FichaPratica06;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        while(numero == 0 || numero < 0){
            System.out.print("Insira um numero: ");
            numero = input.nextInt();
            asteriscos(numero);
        }
    }

    public static void asteriscos(int a){
        for(int i = 0; i < a; i++){
            System.out.print("*");
        }
    }
}
