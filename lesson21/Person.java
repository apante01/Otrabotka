package lesson21;

public class Person {
    private String name;
    private int age;
    private int expirience;

    public Person(String name, int age, int expirience) {
        this.name = name;
        this.age = age;
        this.expirience = expirience;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", expirience=" + expirience +
                '}';
    }
}
