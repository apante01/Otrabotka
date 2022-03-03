package service;

import personal.DeliveryPerson;
import product.Apple;

import java.util.Scanner;

public class ShopStartApp {

    public static void main(String[] args) {
        System.out.println("Наши рабочие дни");
       Day[] days = Day.values();
       for (Day day : days)
           System.out.println(day);
        Scanner sc = new Scanner(System.in);
        ShopService shopService = new ShopService();
        Apple apple = new Apple();
        shopService.buy(apple);
        System.out.println("Введите день доставки");
        DeliveryPerson deliveryPerson = shopService.confirmDelivery(apple,sc.next());
        System.out.println(deliveryPerson);

    }
}
