package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static FichaPratica07.Ex01.scanFile;

public class Ex03 {

    public static void main(String[] args) {
        try{
            File file = new File("src/Files/exercicio_03.txt");
            Scanner sc = new Scanner(file);

            File file2 = new File("src/Files/exercicio_03_Alternativa01.txt");
            PrintWriter printWriter = new PrintWriter(file2);

            while(sc.hasNext()){
                printWriter.println(sc.nextLine());
            }
            printWriter.close();
        }catch(FileNotFoundException exc){
            System.out.println("File not found");
        }
        scanFile("src/Files/exercicio_03_Alternativa01.txt");
    }
}
