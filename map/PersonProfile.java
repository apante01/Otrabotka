package map;

public class PersonProfile {
    private String fio;
    private String salary;
    private String workPosition;

    public PersonProfile(String fio, String salary, String workPosition) {
        this.fio = fio;
        this.salary = salary;
        this.workPosition = workPosition;
    }

    @Override
    public String toString() {
        return "PersonProfile{" +
                "fio='" + fio + '\'' +
                ", salary='" + salary + '\'' +
                ", workPosition='" + workPosition + '\'' +
                '}';
    }
}
