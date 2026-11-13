package FichaPratica07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex01 {

    public static void scanFile(String path) {


        try {

            File file = new File(path);
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException exc) {
            System.out.println("File not found.");
        }
    }

    public static void main(String[] args) {

        scanFile("src/Files/exercicio_01.txt");

    }

}