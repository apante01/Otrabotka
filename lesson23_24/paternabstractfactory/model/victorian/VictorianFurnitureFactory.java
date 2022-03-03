package lesson23_24.paternabstractfactory.model.victorian;

import lesson23_24.paternabstractfactory.factory.FurnitureFactory;
import lesson23_24.paternabstractfactory.model.Chair;
import lesson23_24.paternabstractfactory.model.Sofa;
import lesson23_24.paternabstractfactory.model.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Стул VictorianChair создан");
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Стол createTable создан");
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Диван VictorianSofa создан");
        return new VictorianSofa();
    }
}
