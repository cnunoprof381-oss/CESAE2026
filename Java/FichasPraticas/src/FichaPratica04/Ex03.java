package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Insira um numero: ");
        num = input.nextInt();
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
    }
}
