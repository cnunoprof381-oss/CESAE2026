package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static FichaPratica07.Ex01.scanFile;

public class Ex02 {

    public static void createFile(String path){

        try{
            File file = new File(path);
            PrintWriter write = new PrintWriter(file);
            String content = "Escreve uma mensagem aqui!";
            write.println(content);
            write.close();

        }catch(FileNotFoundException exc){
            System.out.println("File not found.");
        }

        scanFile(path);

    }

    public static void main(String[] args) {

        createFile("src/Files/Exemplo.txt");

    }
}
