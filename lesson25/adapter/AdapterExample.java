package lesson25.adapter;

import lesson15.BankService;
import lesson25.UsdToRuble;
import lesson25.UsdToRubleService;

public class AdapterExample {
    public static void main(String[] args) {
        UsdToRuble usdToRuble = UsdToRubleService.getActual();
        System.out.println(usdToRuble);

    }
}
