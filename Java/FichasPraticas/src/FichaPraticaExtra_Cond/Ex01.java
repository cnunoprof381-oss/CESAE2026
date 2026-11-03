package FichaPraticaExtra_Cond;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            int idade = -1;
            while(idade < 0){
                System.out.println("Insira a sua idade: ");
                idade = input.nextInt();
            }
            if(idade >= 18){
                System.out.println("É maior de idade.");
            }else{
                System.out.println("É menor de idade");
                exit = true;
            }
        }
    }

}
