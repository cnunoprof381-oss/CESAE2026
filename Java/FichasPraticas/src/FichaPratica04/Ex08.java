package FichaPratica04;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, soma = 0;
        boolean tri = false;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        for(int i = 1; soma < num; i++){
            soma += i;
            if(soma == num)
            {
                tri = true;
            }

        }
        System.out.println("O numero " + num + (tri ? "" : " não") + " é triangular");
    }
}
