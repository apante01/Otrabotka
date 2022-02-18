package container;

import product.Product;
import service.Basket;


public class BasketOnArray  {
    private int basketIndex;
    private int regenArrayIndex;// этот индекс пересоздаст массив когда текущий массив достигнет придела
    private Product[]products = new Product[10];// Так делать не правильно


    public void addProduct(Product product) {
        if(basketIndex>=10){
            Product[]products2 = new Product[products.length+10];// здесь мы динамически увеличиваем массив
            // на 10 элементов относительно прошлого массива
            System.arraycopy(products,0,products2,0,products.length);
            products = products2;
            regenArrayIndex=0;// сдесь мы этот индекс обнуляем, если мы сделали пересоздание массива
            //после каждой 10 итерации (после перезаписи) мы обнуляем индекс
        }
        products[basketIndex++] = product;
        regenArrayIndex++;
    }

    public Product[] getProducts() {
        return products;
    }
}
