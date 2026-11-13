package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        try{
            File file = new File("src/Files/exercicio_04.csv");
            Scanner sc = new Scanner(file);
            int numeroQuartos = 0;
            sc.nextLine(); // Avança o cabeçalho
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] split = line.split(";");

                numeroQuartos+=Integer.parseInt(split[4]);

                for (int i = 0; i <split.length ; i++) {
                    System.out.print(split[i] + " | ");
                }
                System.out.println("\n__________________________________________________________");


            }

            System.out.println("Total de quartos: "+numeroQuartos);

        }catch(FileNotFoundException exc){
            System.out.println("File not found");
        }
    }
}
