package FichaPratica05;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[5][3];
        int val, count = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println("Introduza um numero na matriz[" + i +"][" + j + "]");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.print("Introduza um valor para pesquisar: ");
        val = input.nextInt();

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(val == matriz[i][j]){
                    count++;
                }
            }
        }

        System.out.print("O valor " + val + " aparece " + count + " vezes na matriz");

    }
}
