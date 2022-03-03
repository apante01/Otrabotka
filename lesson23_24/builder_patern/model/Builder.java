package lesson23_24.builder_patern.model;

public interface Builder {

    void reset();

    void buildRoof();
    void buildWalls();
    void buildBackground();
    House getResult();
}
