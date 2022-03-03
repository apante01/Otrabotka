package lesson23_24.builder_patern.model.roof;

public class Roof {

    @Override
    public Roof clone(){
        return new Roof();
    }
}
