package otrabotka;

import product.Product;

import java.util.*;

public class CollectionGenerator {
    public static Collection <Product> getAnyCollection(){
        Random r = new Random();
        int i = r.nextInt();
        if(i % 2 == 0)//% остаток деления на
        return new HashSet<>();
        else if (i % 2 == 1) {
            return new ArrayList<>();
        }
        return new LinkedList<>();
    }
}
