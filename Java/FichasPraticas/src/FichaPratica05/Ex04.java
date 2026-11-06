package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[4];
        int menor = Integer.MAX_VALUE;
        System.out.println("Insira um numero: ");
        array[0] = input.nextInt();
        if(array[0] < menor){
            menor = array[0];
        }
        for(int i = 1; i < array.length; i++){
            System.out.println("Insira um numero: ");
            array[i] = input.nextInt();
            if(array[i] < menor){
                menor = array[i];
            }
        }
        System.out.print(menor);
    }
}
