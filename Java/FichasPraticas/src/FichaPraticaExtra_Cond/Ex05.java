package FichaPraticaExtra_Cond;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        boolean exit = false;
        while(!exit){
            int num = r.nextInt(101), guess = -1, failure = 0;
            while(guess != num && failure<=5){
                System.out.println("Imprima um palpite: ");
                guess = input.nextInt();
                if(num != guess){
                    if(guess > num){
                        if(guess > num * 2.0){
                            System.out.println("O numero é muito menor do que " + guess);
                        }else System.out.println("O numero é menor do que " + guess);
                    }else{
                        if(guess < num / 2.0) System.out.println("O numero é muito maior do que " + guess);
                        else System.out.println("O numero é maior do que " + guess);
                    }
                    failure++;
                }
                if(failure > 5){
                    exit = true;
                }
            }
            if(failure <= 5){
                System.out.println("Advinhou!!");
                exit = true;
            }
        }
    }
}
