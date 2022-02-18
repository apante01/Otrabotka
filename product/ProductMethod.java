package product;

public interface ProductMethod {

    int STORE_ID_NUMBER = 345543;

    default void buyProduct(){
        System.out.println("Купить продукт");
    }
    default void putProduct(){}

    default void putBasket(){}


    default void printPrice(int price){
        price = price > 0? price : defaultPrice();
        System.out.println(price);

    }
    private int defaultPrice(){
        return 100;
    }

}
