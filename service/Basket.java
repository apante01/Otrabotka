package service;

import product.Product;

public interface Basket {
    void addProduct(Product product);
    Object[] getProducts();
}
