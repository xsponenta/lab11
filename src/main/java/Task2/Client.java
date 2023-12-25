package Task2;

//import Task1.Gender;

import lombok.Getter;

import lombok.Setter;

public class Client {

    private static int count = 0;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Gender gender;
    @Getter @Setter
    private int age;
    @Getter
    private final int id;

    public Client(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        id = count++;
    }

}