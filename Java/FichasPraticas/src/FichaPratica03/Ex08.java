package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Introduza um numero: ");
        num = input.nextInt();

        for(int i = (num - 5); i <= (num + 5); i++)
        {
            if(i != num) System.out.println(i);
        }

    }
}