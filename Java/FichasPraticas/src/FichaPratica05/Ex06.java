package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        boolean crescent = true;
        boolean decrescent = true;
        int temp = Integer.MIN_VALUE;
        System.out.println("Insira 10 numeros: ");
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }
        for(int i = 0; i < array.length; i++){
            if(temp > array[i]){
                crescent = false;
            }

            if (temp == Integer.MIN_VALUE)
                temp = Integer.MAX_VALUE;

            if(temp < array[i]) decrescent = false;

            temp = array[i];
        }
        if(crescent) System.out.print("O array é crescente.");
        if(decrescent) System.out.print("O array é decrescente.");
        else System.out.print("O array não é crescente nem decrescente.");
    }
}
