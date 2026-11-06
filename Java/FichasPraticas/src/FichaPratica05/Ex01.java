package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int numero;
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Insira um numero: ");
            numeros[i] = input.nextInt();
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
