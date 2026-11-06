package FichaPratica05;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int min, max;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("Insira um numero: ");
                matriz[i][j] = input.nextInt();
            }
        }
        min = matriz[0][0];
        max = matriz[0][0];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(matriz[i][j] > max) max = matriz[i][j];
                if(matriz[i][j] < min) min = matriz[i][j];
            }
        }
        System.out.print("Valor minimo: " + min + " Valor max: " + max);
    }
}
