package service;

public enum Day {
    MONDAY ("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String name;

    Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void resolveByName(){}
}
