package product;

public class Apple extends Fruit {




    public Apple(String name){
    super(name);
}

    public Apple() {}

    @Override
    void eat() {

    }

    @Override
    void makeJuice() {

    }

    @Override
    public String toString() {
        return getName();
    }




}
