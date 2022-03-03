package lesson23_24.builder_patern.model.roof;

public class CherepicaRoof extends Roof{

    @Override
    public Roof clone() {
        return new CherepicaRoof();
    }
}
