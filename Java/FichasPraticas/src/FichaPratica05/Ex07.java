package FichaPratica05;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int maior = Integer.MIN_VALUE, counter = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Insira um numero: ");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > maior) {
                maior = array[i];
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        if(counter > 0) System.out.print("Maior numero par: " + maior);
        else System.out.print("O array não contem numeros pares.");
    }
}
