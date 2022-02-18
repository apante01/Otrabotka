package service;

import product.Product;

import java.util.ArrayList;
import java.util.Collection;

public class BasketOnList implements Basket{

Collection<Product>products = new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        products.add(product);

    }

    @Override
    public Object[] getProducts() { // алгоритм завязан на массиве, по этому здесь оставим массив
        return products.toArray();
    }
}
