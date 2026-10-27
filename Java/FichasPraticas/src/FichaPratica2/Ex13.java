package FichaPratica2;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;
        String tempo;

        System.out.print("Introduza a hora");
        horas = input.nextInt();
        System.out.print("Introduza os minutos");
        minutos = input.nextInt();

        if(horas > 12){
            tempo = "PM";
            horas -= 12;
            System.out.println("São: " + horas + ":" + minutos + tempo);
        }else{
            tempo = "AM";
            System.out.println("São: " + horas + ":" + minutos + tempo);
        }

    }
}
