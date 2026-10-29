package FichaPratica03;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;

        for(int i = 0; i <= 100; i++){
            System.out.println(i);
            soma = soma + i;
        }
        System.out.print(soma);
    }
}
