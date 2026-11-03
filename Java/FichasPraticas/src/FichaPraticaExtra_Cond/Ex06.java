package FichaPraticaExtra_Cond;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            int year = -1;

            while(year <= 0){
                System.out.println("Insira um ano: ");
                year = input.nextInt();
            }

            for(int i = 0; i <= year; i++){
                if(i == year){
                    if(i % 4 == 0){
                        System.out.println("é bissexto");
                        exit = true;
                    }
                }
            }
        }
    }
}
