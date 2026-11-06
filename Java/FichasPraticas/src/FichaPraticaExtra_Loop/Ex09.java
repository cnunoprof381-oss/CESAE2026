package FichaPraticaExtra_Loop;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, soma = 0;
        System.out.print("Insira um numero: ");
        num = input.nextInt();

        while(num > 0){
            soma += num % 10;
            num /= 10;
        }
        System.out.print(soma);
    }
}
