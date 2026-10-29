package FichaPratica03;

import java.util.Scanner;

public class Ex15_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fator;
        System.out.print("Insira um valor: ");
        n = input.nextInt();
        fator = n;
        for(int i = (n - 1); i > 1; i--){
            n = fator;
            for(int j = i; j > 1; j--){
                fator += n;
            }
        }
        System.out.println(fator);
    }
}
