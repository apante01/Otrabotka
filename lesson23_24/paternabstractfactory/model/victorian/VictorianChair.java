package lesson23_24.paternabstractfactory.model.victorian;

import lesson23_24.paternabstractfactory.model.Chair;

public class VictorianChair implements Chair {
    @Override
    public int hasLegs() {
        return 6;
    }

    @Override
    public void sitOn() {
        System.out.println("VictorianChair");

    }
}
