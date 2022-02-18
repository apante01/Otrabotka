import product.Apple;
import product.Fruit;

import javax.sound.midi.Soundbank;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
       Set<Fruit>collection =  populateCollection();

        System.out.println(collection.contains(new Apple("Apple 10")));




            //Fruit fruit = collection.get(i);


    }


    private static Set<Fruit> populateCollection() {


        Set<Fruit> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {

                set.add(new Apple("Apple "+String.valueOf(i)));

        }
        return set;
    }
}
/*


 */