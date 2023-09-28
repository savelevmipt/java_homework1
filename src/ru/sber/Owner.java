package ru.sber;

public class Owner {
    private final String name;
    private final String lastName;
    private final int age;
    public Owner(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }




    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
