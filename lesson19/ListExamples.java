package lesson19;

import product.Apple;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListExamples {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        File f = new File(fileName);
        if(!f.exists()){
            f.createNewFile();
            System.out.println("Файл создан"+" "+f.getAbsolutePath());
        }else
            System.out.println("Файл уже существует");



    }
}
