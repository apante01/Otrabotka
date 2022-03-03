package lesson23_24.builder_patern;

import lesson23_24.builder_patern.model.Builder;
import lesson23_24.builder_patern.model.House;

public class Director {
    private Builder karkasBuilder = new KarkasBuilder();
    private Builder kirpichBuilder = new KirpichBuilder();



    public House makeHouse(String type) {
        Builder builder = null;
        if ("кирпичный".equals(type)) {
            builder = new KirpichBuilder();

        } else if ("каркасный".equals(type)) {
            builder = new KarkasBuilder();
        }/*else if("элитный дом".equals(type)){
            builder = new KirpichBuilder(); пример, захотели построить элитный дом взяли за основу
            builder.buildPool();            кирпичный дом и достроили бассейн
        }
        */

        if (builder != null){
        builder.reset();
        builder.buildBackground();
        builder.buildWalls();
        builder.buildRoof();
            return builder.getResult();
        }else
            return null;
    }
}
