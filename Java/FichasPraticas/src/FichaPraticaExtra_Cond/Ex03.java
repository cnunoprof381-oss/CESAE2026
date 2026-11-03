package FichaPraticaExtra_Cond;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            double preco = 0;
            String ans = "";
            System.out.println("Introduza um preço: ");
            preco = input.nextDouble();
            if(preco > 100.0){
                preco *= 0.9;
                System.out.println(preco);
            }else{
                System.out.println(preco);
            }
            System.out.println("Quer continuar? y/n");
            ans = input.next();
            if(ans.equals("n") || ans.equals("N")){
                exit = true;
            }
        }
    }
}
