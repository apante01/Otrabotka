package lesson23_24.builder_patern.model.roof;

public class ProfilRoof extends Roof{

    @Override
    public Roof clone() {
        return new ProfilRoof();
    }
}
