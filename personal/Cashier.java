package personal;

import javax.crypto.spec.PSource;

public class Cashier extends Sotrudnik {

    public Cashier(String name, String position) {
        super(name, position);
    }

    @Override
    public void checkPosition() {
        System.out.println(getPosition());
    }
}
