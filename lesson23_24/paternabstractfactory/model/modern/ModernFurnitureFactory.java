package lesson23_24.paternabstractfactory.model.modern;

import lesson23_24.paternabstractfactory.factory.FurnitureFactory;
import lesson23_24.paternabstractfactory.model.Chair;
import lesson23_24.paternabstractfactory.model.Sofa;
import lesson23_24.paternabstractfactory.model.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Стул ModernChair создан");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Стол ModernTable создан");
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        System.out.println("Диван ModernSofa создан");
        return new ModernSofa();
    }
}
