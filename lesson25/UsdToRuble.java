package lesson25;

public class UsdToRuble {
    private Double value;

    public UsdToRuble(double value) {
        this.value = value;
   }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "UsdToRuble{" +
                "value=" + value +
                '}';
    }
}
