package service;

import personal.DeliveryPerson;
import product.Product;

import java.util.HashMap;
import java.util.Map;

public class ShopService {
//В коллекции будут хранится работники по дням (кто в какой день работает)
   private Map<Day,DeliveryPerson> dayToDelivery = new HashMap<>();

    public ShopService(){
        dayToDelivery.put(Day.MONDAY,new DeliveryPerson("Петя","9011111221"));
        dayToDelivery.put(Day.THURSDAY,new DeliveryPerson("Коля","9011113333"));
        dayToDelivery.put(Day.WEDNESDAY,new DeliveryPerson("Оля","9011114444"));
        dayToDelivery.put(Day.TUESDAY,new DeliveryPerson("Маша","9011115555"));
        dayToDelivery.put(Day.FRIDAY,new DeliveryPerson("Женя","9011116666"));
        dayToDelivery.put(Day.SATURDAY,null);
        dayToDelivery.put(Day.SUNDAY,null);

    }

    public void buy(Product p) {

    }
    /*
    Пишем метод который подтверждает доставку на определенный день
     */
    public  DeliveryPerson confirmDelivery(Product p,String day){
       Day value =  Day.valueOf(day);
        System.out.println(value.getName());
     return dayToDelivery.get(value);

    }
}
