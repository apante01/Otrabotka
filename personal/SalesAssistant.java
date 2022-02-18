package personal;

import java.util.Scanner;

public class SalesAssistant implements Comparable {
    public int id;
    public String name;

    public SalesAssistant(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void nameS(){
        System.out.println("Меня зовут Петя");
    }

    @Override
    public int compareTo(Object o) {
        return id - ((SalesAssistant)o).id;
    }

    @Override
    public String toString() {
        return id + " " + name ;
    }

public void sayName(Scanner scanner){
    System.out.println("Вам представиться?");
    while (true){
        System.out.println("Да - 1" + "\n" + "Нет - 2");
        int a = scanner.nextInt();
        if (a == 1) {
            nameS();
            break;
        }else if (a == 2) {
            System.out.println("Вы всегда можете вернуться к нам за данной информацией");
            break;
        }


    }
}
}
