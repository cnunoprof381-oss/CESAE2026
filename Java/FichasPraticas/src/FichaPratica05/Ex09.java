package FichaPratica05;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Introduza um numero: ");
                matriz[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                soma += matriz[i][j];
            }
        }
        System.out.print("Soma: " + soma);
    }
}
