package lesson23_24.singleton;

import java.io.File;
import java.io.IOException;

public class SingletonExample {

    public static void main(String[] args) throws IOException {
        Database db1 =  Database.getInstance();
        db1.readDataFromDB();
        Database db2 = Database.getInstance();
        db2.readDataFromDB();
        Database db3 = Database.getInstance();
        db3.readDataFromDB();
        Database db4 = Database.getInstance();
        db4.readDataFromDB();
        Database db5 = Database.getInstance();
        db5.readDataFromDB();
    }
}
