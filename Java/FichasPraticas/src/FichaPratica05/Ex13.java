package FichaPratica05;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int soma = 0;

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = r.nextInt(50);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(i == j){
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println(soma);
    }
}
