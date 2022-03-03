package lesson23_24.builder_patern;

import lesson23_24.builder_patern.model.*;
import lesson23_24.builder_patern.model.roof.CherepicaRoof;
import lesson23_24.builder_patern.model.roof.Roof;
import lesson23_24.builder_patern.model.wall.KirpichWall;
import lesson23_24.builder_patern.model.wall.Wall;
import lesson23_24.builder_patern.model.wall.WoodWall;

import java.util.ArrayList;
import java.util.List;

public class KirpichBuilder implements Builder {
    private List<Wall> wall = null;
    private Background background = null;
    private Roof roof = null;

    @Override
    public void reset() {
        wall = null;
        background = null;
        roof = null;
    }

    @Override
    public void buildRoof() {
        roof = new CherepicaRoof();
    }

    @Override
    public void buildWalls() {
        wall = new ArrayList<>();
        wall.add(new KirpichWall());
        wall.add(new KirpichWall());
        wall.add(new KirpichWall());
        wall.add(new WoodWall());
        wall.add(new WoodWall());
        wall.add(new WoodWall());
    }

    @Override
    public void buildBackground() {
        background = new Background();
    }

    @Override
    public House getResult() {
        return new House(roof,background,wall);
    }
}
