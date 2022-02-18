package product;

public interface OtherMethod extends ProductMethod{


    default void productRent(){}

    default void productMerch(){
        System.out.println("Мерчендайзинг товара");
    }
}
