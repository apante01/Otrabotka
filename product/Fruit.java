package product;

public abstract class Fruit extends Product {
    public Fruit() {
    }

    public Fruit(String name) {
        super(name);

    }

    abstract void  eat();
    abstract void  makeJuice();
}
