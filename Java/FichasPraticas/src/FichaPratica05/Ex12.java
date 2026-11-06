package FichaPratica05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[][] ab = new int[10][2];

        for(int i = 0; i < a.length; i++){
            System.out.println("Insira um valor no array a[" + i + "]: ");
            a[i] = input.nextInt();
        }
        for(int i = 0; i < a.length; i++){
            System.out.println("Insira um valor no array b[" + i + "]: ");
            b[i] = input.nextInt();
        }
        for(int i = 0; i < a.length; i++){
           ab[i][0] = a[i];
           ab[i][1] = b[i];
           System.out.println(ab[i][0] + " " + ab[i][1]);
        }

    }
}
