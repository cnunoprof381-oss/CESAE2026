package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[4];
        double val = 0, soma = 0;
        for(int i = 0; i < array.length; i++){
            System.out.print("Insira um valor: ");
            val = input.nextDouble();
            array[i] = val;
            System.out.println(array[i]);
        }

        for(int i = 0; i < array.length; i++){
            soma += array[i];
        }
        System.out.print("Soma anual: " + soma);

    }
}
