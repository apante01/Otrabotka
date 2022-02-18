package lesson20;

import java.io.File;
import java.io.IOException;

public class FileApp {

    public static void main(String[] args) throws IOException {
        File f = new File("testDir/Продажи.txt");
        if (f.exists()) {
            File parentDir = new File(f.getParent());

            System.out.println("Файл существует (" + parentDir.getName() + ") Найден");
            for (File cur : parentDir.listFiles(new MyFileNameFilter())) {
                System.out.print(cur.getName());
                if (cur.isDirectory()){
                    System.out.println(" - Представлен каталог");
                }else
                    System.out.println(" - Представлен файл");
            }
            }else{
                System.out.println("Файл создан " + f.getName());
                f.createNewFile();}

        }
    }

