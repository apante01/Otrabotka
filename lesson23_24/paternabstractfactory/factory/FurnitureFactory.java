package lesson23_24.paternabstractfactory.factory;

import lesson23_24.paternabstractfactory.model.Chair;
import lesson23_24.paternabstractfactory.model.Sofa;
import lesson23_24.paternabstractfactory.model.Table;

public interface FurnitureFactory {
    Chair createChair();

    Table createTable();

    Sofa createSofa();
}
