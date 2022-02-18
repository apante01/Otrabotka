package personal;

import product.Ball;
import product.Product;

public abstract class Sotrudnik {
    private String name;
    private String position;

    public Sotrudnik(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public Sotrudnik() {
    }

    public String getPosition() {
        return position;
    }

    public void checkName(){
    System.out.println(name);
}
public abstract void checkPosition();}
