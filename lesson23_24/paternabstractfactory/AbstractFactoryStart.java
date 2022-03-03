package lesson23_24.paternabstractfactory;


import lesson23_24.paternabstractfactory.factory.FurnitureFactory;
import lesson23_24.paternabstractfactory.model.Chair;
import lesson23_24.paternabstractfactory.model.Sofa;
import lesson23_24.paternabstractfactory.model.Table;
import lesson23_24.paternabstractfactory.model.modern.ModernFurnitureFactory;
import lesson23_24.paternabstractfactory.model.victorian.VictorianFurnitureFactory;

import java.util.Scanner;

public class AbstractFactoryStart {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите стиль мебели для поиска и выбора");
        String type = sc.next();
        FurnitureFactory factory = null;
        if ("Викторианский_стиль".equals(type)){
            factory = new VictorianFurnitureFactory();
        }else if("Модерн_стиль".equals(type)){
            factory = new ModernFurnitureFactory();
        }
        System.out.println("Напишите товар который хотите заказать!(Стол,Стул,Диван)");
        String productType = sc.next();
        if ("Стол".equals(productType)){
         Table t =  factory.createTable();
        }else if("Стул".equals(productType)){
          Chair c =  factory.createChair();
        }else if("Диван".equals(productType)){
          Sofa s = factory.createSofa();
        }
    }

}
