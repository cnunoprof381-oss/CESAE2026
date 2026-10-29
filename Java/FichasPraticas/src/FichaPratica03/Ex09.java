package FichaPratica03;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num, soma, div, media;
        num = 0;
        soma = 0;
        div = 0;
        for(num = num; num != -1; div++) {
            soma = soma + num;
            System.out.print("Introduza um numero: ");
            num = input.nextInt();
            if(num == -1){
                div -= 1;
            }
        }
            if(div != 0){
                media = soma/div;
                System.out.print(media);
            }


    }
}
