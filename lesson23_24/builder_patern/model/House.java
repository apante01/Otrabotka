package lesson23_24.builder_patern.model;

import lesson23_24.builder_patern.model.roof.Roof;
import lesson23_24.builder_patern.model.wall.Wall;

import java.util.List;

public class House implements Cloneable{
    private Roof roof;
    private Background background;
    private List<Wall> wall;

    public House(Roof roof,Background background,List<Wall> wall){
        this.roof = roof;
        this.background = background;
        this.wall = wall;
    }
public House clone(){
        return new House(roof.clone(),background,wall);
}

}
