package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        try{
            File file = new File("src/Files/exercicio_06.txt");
            Scanner sc = new Scanner(file);
            String nomeMaior = "";
            int maior = -1;
            while(sc.hasNext()){
                String line = sc.nextLine();
                String[] split = line.split(",");
                for(int i = 0; i < split.length; i++){
                    if(Integer.parseInt(split[1]) > maior){
                        maior = Integer.parseInt(split[1]);
                        nomeMaior = split[0];
                    }
                }
            }
            System.out.println(nomeMaior + " " + maior);
        }catch(FileNotFoundException exc){
            System.out.println("File not found.");
        }


    }
}
