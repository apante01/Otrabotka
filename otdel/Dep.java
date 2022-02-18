package otdel;

import product.Product;

public class Dep {
    private String depName;

    public Dep() {
    }

    public Dep(String depName) {
        this.depName = depName;
        System.out.println(depName);
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
        System.out.println(depName);
    }
    public void givePrice(){
        System.out.println("Цена");
    }

}
