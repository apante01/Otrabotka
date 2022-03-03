package lesson23_24.paternabstractfactory.model.modern;

import lesson23_24.paternabstractfactory.model.Chair;

public class ModernChair implements Chair {
    @Override
    public int hasLegs() {
        return 0;
    }

    @Override
    public void sitOn() {
        System.out.println("ModernChair");
    }
}
