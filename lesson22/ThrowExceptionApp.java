package lesson22;

import java.util.Scanner;

public class ThrowExceptionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер карты");
        String cardNumber = sc.next();
        try {
        processCardNumber(cardNumber);}
        catch (CardNumberInvalidException c){
            System.out.println(c.getMessage());
            System.out.println("Номер карты: "+ c.getCardNumber());
                System.out.println("Введите номер банковского счета");
                c.printStackTrace();
                String accountNumber = sc.next();
                processAccountNumber(accountNumber);
        }
    }
    private static boolean  processCardNumber(String cardNumber) throws CardNumberInvalidException {

            if (cardNumber.length() > 16) {
                throw new CardNumberInvalidException("Введенный номер карты превышает 16 символов: " + cardNumber.length(),
                        cardNumber);
            }else if(cardNumber.length() < 16){
                throw new CardNumberInvalidException("Введенный номер карты меньше 16 символов: " + cardNumber.length(),
                        cardNumber);
            }
            System.out.println("вы вошли в систему по немеру карты: "+cardNumber);

        return false;
    }
    private static void processAccountNumber(String accountNumber) {
        System.out.println("Введеный номер счета: "+accountNumber);
    }
}

