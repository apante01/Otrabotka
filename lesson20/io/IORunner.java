package lesson20.io;

import java.io.*;
import java.util.Scanner;

public class IORunner {
    public static void main(String[] args) throws IOException {
        //Записать файл
        File f2 = new File("testDir/Продажи2.txt");


        try(FileWriter fw = new FileWriter(f2)) {
            Scanner sc = new Scanner(System.in);


            if (!f2.exists()) f2.createNewFile();


            fw.write(sc.nextLine());
            fw.flush();
            System.out.println("Работа завершена успешно");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Здесь ошибка");

        }
    }
}
