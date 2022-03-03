package lesson23_24.builder_patern;

import lesson23_24.builder_patern.model.House;

import java.util.Scanner;

public class BuilderExample {
    public static void main(String[] args) {
        Director vasya = new Director();
        Scanner sc = new Scanner(System.in);
        String houseType = sc.next();

        House mySweetHouse = vasya.makeHouse(houseType);
        House oneMoreHouse = mySweetHouse.clone();
    }
}
