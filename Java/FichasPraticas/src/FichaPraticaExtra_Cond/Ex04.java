package FichaPraticaExtra_Cond;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            String letter = "";
            String ans = "";
            System.out.print("Escreva uma letra: ");
            letter = input.next();
            if(letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")){
                System.out.println(letter + " é uma vogal.");
            }else{
                System.out.println(letter + " é uma consoante.");
            }
            System.out.print("Queres continuar?(y/n)");
            ans = input.next();
            if(ans.equals("n") || ans.equals("N")){
                exit = true;
            }
        }

    }
}
