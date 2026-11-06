package FichaPraticaExtra_Loop;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, temp;
        System.out.print("Introduza dois numeros: ");
        num1 = input.nextInt();;
        num2 = input.nextInt();
        temp = num1;
        for(int i = 1; i < num2; i++){
            num1 *= temp;
        }
        System.out.print(num1);
    }
}
