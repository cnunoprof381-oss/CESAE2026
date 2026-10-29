package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, count1, count2, count3, count4;
        num = 1;
        count1 = 0;
        count2 = 0;
        count3 = 0;
        count4 = 0;
        for(num = num; num >= 0;){
            System.out.println("Introduza um numero: ");
            num = input.nextInt();
            if(num >= 0 && num <= 25)
            {
                count1++;
            }else if(num >= 26 && num <= 50){
                count2++;
            }else if(num >= 51 && num <= 75){
                count3++;
            }else if(num >= 76 && num <= 100){
                count4++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
    }
}
