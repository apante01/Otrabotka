package lesson23_24.singleton;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Database {
    private File file;
    private static Database db;

    private Database() {
        file = new File("db.txt");
    }
    public static Database getInstance(){
        if (db==null){
            db = new Database();
        }
        return db;
    }

    public String readDataFromDB() {
        try (BufferedReader br = new BufferedReader(new FileReader("db.txt"))) {
            StringBuilder sb = new StringBuilder();
            String currentLine = "";
            while ((currentLine = br.readLine())!=null){
                System.out.println(currentLine);
                if(currentLine != null && currentLine.isBlank())
                    sb.append(currentLine);
            }
            return sb.toString();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }


}
