package personal;

import java.util.Scanner;

public class Hostes extends Sotrudnik {

    private String hostesName;
    public int age = 10;
    public int count;



    public Hostes(String hostesName) {
        this.hostesName = hostesName;
        System.out.println(hostesName);
    }

    public void offerBasket(Scanner scanner){
       while(true){
           System.out.println("Возьмите, пожалуйста корзину");
           int a =scanner.nextInt();
           if (a == 1) {
               System.out.println("Вас проводить до отдела?");
               System.out.println("1 - Да" + "\n" + "2 - Нет");
               int b = scanner.nextInt();
               if (b == 1){
                   System.out.println("Пройдемте");
               }

           }

       }

    }



    public String hello(){
        System.out.println("I am -"+hostesName);
        return hostesName;}

    @Override
    public void checkPosition() {

    }
}

