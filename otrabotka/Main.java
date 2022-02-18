package otrabotka;

import container.BasketOnArray;
import product.*;
import service.Basket;
import service.BasketOnList;
import service.BasketOnSet;
import service.ShopService;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ShopService s = new ShopService();
        Basket myBasket = new BasketOnSet();

        for (int i=0;i<20;i++){
            myBasket.addProduct(selectAnyProduct());
        }

        Product kivi = new Kivi();
        myBasket.addProduct(kivi);

        //s.buy();
        for (int i = 0; i < myBasket.getProducts().length;i++)
        System.out.println("Index  "+ i +" Product "+  myBasket.getProducts()[i]);

    }

    private static Product selectAnyProduct() {
        Random r = new Random();
       int i =  r.nextInt(100);
       if (i % 2 == 0){
           return new Apple();
       }
        return new Kivi();
    }


}


