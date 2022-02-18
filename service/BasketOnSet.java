package service;

import product.Product;

import java.util.Collection;
import java.util.HashSet;

public class BasketOnSet implements Basket{

    Collection<Product> products = new HashSet<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);

    }

    @Override
    public Object[] getProducts() {
        return products.toArray();
    }
}
