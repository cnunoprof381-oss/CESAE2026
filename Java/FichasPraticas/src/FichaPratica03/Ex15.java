package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fator, temp;
        System.out.print("Insira um valor: ");
        n = input.nextInt();
        temp = n;
        fator = n - 1;
        while(fator >= 1){
            n *= fator;
            fator -= 1;
        }
        System.out.print(temp + "! = " + n);
    }
}
