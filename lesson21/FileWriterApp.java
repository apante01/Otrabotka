package lesson21;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriterApp {
    private static String CATALOG_NAME = "testDir/";

    public static void main(String[] args) {

        System.out.println("Записать данные или выгрузить в файл?");
        System.out.println("1. Загрузить");
        System.out.println("2. Выгрузить и отобразить");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Введите Имя, возраст и стаж");
            dbWrite(sc);
        } else if (choice == 2) {
            dbRead(sc);
        }

    }

    private static void dbWrite(Scanner sc) {
        String personName = sc.next();
        try (FileWriter fw = new FileWriter(CATALOG_NAME + personName, true)) {
            fw.write("name:" + sc.next() + " ");
            fw.write("age:" + sc.nextInt() + " ");
            fw.write("expirience:" + sc.nextInt() + " ");
            fw.write("\n");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dbRead(Scanner sc) {
        String fileName = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(CATALOG_NAME +
                fileName))) {
            List<Person> personList = new ArrayList<>();

            String currentLine = "";
            while ((currentLine = br.readLine()) != null) {
                System.out.println(currentLine);
                if (currentLine !=null&& !currentLine.isBlank())
                personList.add(convertStringToPerson(currentLine));
                //System.out.println(personList);
            }

            System.out.println(personList);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Такой персоны нет " + fileName + " введите другое имя");
            dbRead(sc);
        }
    }

    private static Person convertStringToPerson(String currentLine) {
        String[] splitted = currentLine.split(" ");
        Person person = new Person();
        for (String s : splitted) {
           getNameAndSet(s,person);
           getAgeAndSet(s,person);

        }
        return person;

    }

    private static void getAgeAndSet(String s, Person p) {
        if(s!= null && s.contains("age:")){
            p.setAge(Integer.valueOf(s.split(":")[1]));
        }
    }

    private static void getNameAndSet(String s, Person p) {
        if(s!= null && s.contains("name:")){
            p.setName(s.split(":")[1]);
        }
    }


}

