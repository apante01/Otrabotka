package lesson22;

public class CardNumberInvalidException extends Exception{
    private String cardNumber;

    public CardNumberInvalidException(String massage,String cardNumber){
        super(massage);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
