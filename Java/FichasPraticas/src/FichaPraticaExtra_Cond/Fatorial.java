package FichaPraticaExtra_Cond;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fator, temp = 0;
        num = input.nextInt();
        fator = num - 1;

        for(int i = fator; i > 1; i--){
            temp = num;
            for(int j = i; j > 1; j--){
                num += temp;
            }
        }
        System.out.println(num);
    }
}
