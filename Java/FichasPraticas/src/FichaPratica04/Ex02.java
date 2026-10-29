package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0;
        for(int i = 11; i <= 51; i++){
            if(i % 2 != 0)
            {
                soma += i;
                System.out.println(i);
            }
        }
        System.out.print(soma);
    }
}
