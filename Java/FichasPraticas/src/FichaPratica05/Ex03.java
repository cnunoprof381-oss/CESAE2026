package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        int maior = Integer.MIN_VALUE;
        System.out.println("Insira um numero: ");
        array[0] = input.nextInt();
        if(array[0] > maior){
            maior = array[0];
        }
        for(int i = 1; i < array.length; i++){
            System.out.println("Insira um numero: ");
            array[i] = input.nextInt();
            if(array[i] > maior){
                maior = array[i];
            }
        }
        System.out.print(maior);
    }
}
