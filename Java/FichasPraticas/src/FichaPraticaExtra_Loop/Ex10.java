package FichaPraticaExtra_Loop;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Insira um numero: ");
        num = input.nextInt();

        while(num > 0){
            System.out.print(num % 10);
            num /= 10;
        }
    }
}
