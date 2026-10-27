package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sec1, sec2, sec3, sec4, sec5, min1, min2, min3, min4, min5;
        int total = 0;
        System.out.print("Minutos da primeira canção: ");
        min1 = input.nextInt();
        min1 *= 60;
        System.out.print("Segundos da primeira canção: ");
        sec1 = input.nextInt();
        total = min1 + sec1;

        System.out.print("Minutos da segunda canção: ");
        min2 = input.nextInt();
        min2 *= 60;
        System.out.print("Segundos da segunda canção: ");
        sec2 = input.nextInt();
        total = total + min2 + sec2;

        System.out.print("Minutos da terceira canção: ");
        min3 = input.nextInt();
        min3 *= 60;
        System.out.print("Segundos da terceira canção: ");
        sec3 = input.nextInt();
        total = total + min3 + sec3;

        System.out.print("Minutos da quarta canção: ");
        min4 = input.nextInt();
        min4 *= 60;
        System.out.print("Segundos da quarta canção: ");
        sec4 = input.nextInt();
        total = total + min4 + sec4;

        System.out.print("Minutos da quinta canção: ");
        min5 = input.nextInt();
        min5 *= 60;
        System.out.print("Segundos da quinta canção: ");
        sec5 = input.nextInt();
        total = total + min5 + sec5;

        int horas = total / 3600;
        int minutos = (total % 3600) / 60;
        int segundos = total % 60;

        System.out.println("A duração total do album é : " + horas + "h:" + minutos + "m:" + segundos + "s");

    }
}
