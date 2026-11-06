package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        int counter = 0, soma = 0;
        double media = 0;
        for(int i = 0; i < array.length; i++){
            System.out.print("Insira um numero: ");
            array[i] = input.nextInt();
            counter++;
        }
        for(int i = 0; i < array.length; i++){
            soma += array[i];
            System.out.print(array[i] + "  ");
        }
        if(counter != 0){
            media = soma/counter;
            System.out.print(" = " + media);
        }
    }
}
