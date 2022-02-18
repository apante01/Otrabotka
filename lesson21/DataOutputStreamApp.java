package lesson21;

import java.io.*;
import java.util.Scanner;

public class DataOutputStreamApp {
    public static void main(String[] args) {

        System.out.println("Записать данные или выгрузить в файл?");
        System.out.println("1. Загрузить");
        System.out.println("2. Выгрузить и отобразить");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Введите Имя, возраст и стаж");
            dbWrite(sc);
        }else if(choice == 2){
            dbRead(sc);
        }

    }
    private static void dbWrite(Scanner sc) {
        String personName = sc.next();
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("testDir/Продажи2.txt"+
                personName,true))) {
            dos.writeUTF(personName);
            dos.writeInt(sc.nextInt());
            dos.writeInt(sc.nextInt());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void dbRead(Scanner sc) {
        String personName = sc.next();
        try (DataInputStream dis = new DataInputStream(new FileInputStream("testDir/Продажи2.txt"+
                personName))) {
            Person p = new Person(dis.readUTF(),dis.readInt(),dis.readInt());
            System.out.println(p);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Такой персоны нет, введите другое имя");
            dbRead(sc);
        }
    }
}
