package map;

import java.util.*;

public class MapExample {


    public static void main(String[] args) {
        Map<String, Map <String, Integer>>map = new HashMap<>();
        populateMap(map);
        Map <String, Integer> operations = map.get("131-15-1");
        //System.out.println(operations);
        Set<Map.Entry<String,Integer>> set = operations.entrySet();
        for (Map.Entry<String,Integer>entry:set){
           // System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        List<Map.Entry<String ,Integer>> list = new ArrayList<>(set);
        System.out.println(list.get(1));

       // System.out.println(map.get("111-11-1"));


    }
    public static void populateMap(Map<String, Map <String, Integer>>myMap){

        myMap.put("111-11-1",Map.of("Покупка продуктво в Магните",1235,"Перевод",2002));
        myMap.put("131-15-1",Map.of("Покупка продуктво в МЕТРО",5235,"Перевод",4002));


    }
}
