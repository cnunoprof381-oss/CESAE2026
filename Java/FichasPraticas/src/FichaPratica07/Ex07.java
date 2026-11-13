package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        try{

            File file = new File("src/Files/exercicio_07.txt");
            Scanner sc = new Scanner(file);
            int lineNum = 0;
            int wordNum = 0;
            while(sc.hasNext()){
               String line = sc.nextLine();
               String[] split = line.split(" ");
               wordNum+=split.length;
               lineNum++;
            }
            System.out.println("Numero de linhas: " + lineNum + "\nNumero de palavras: " + wordNum);
        }catch(FileNotFoundException exc){
            System.out.println("File not found.");
        }


    }
}
