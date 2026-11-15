package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        try{
            File file = new File("src/Files/exercicio_05_31.txt");
            Scanner sc = new Scanner(file);
            int numero = 0;
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] split = line.split(" ");
                for(int i = 0; i < split.length; i++){
                    numero += Integer.parseInt(split[i]);
                }
                System.out.println(numero);
            }

        }catch(FileNotFoundException exc){
            System.out.println("File not found");
        }

    }
}
