package lesson22;

public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println("Начало работы программы");// строка отработает, т.к. ошибка в 7 строке
        populateArray();//сделаем метод, ошибка будет отрабатывать также, только в стэктрэйсе будет строка 6 и 12
        System.out.println("Конец работы программы");
    }

    private static void populateArray() {
        try {
        int[] numbers = null;//new int[3];
        numbers[4] = 45;
        System.out.println(numbers[4]);
        }catch (IndexOutOfBoundsException i) {
            System.out.println("ArrayIndexOutOfBoundsException");
            i.printStackTrace();
        }catch(NullPointerException n){
            System.out.println("Exception");
            n.printStackTrace();
        }finally {
            System.out.println("Я всегда выполняюсь");

        }
    }

}
