import java.util.ArrayList;

public class Person1 {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

class Food {

    public void addWine (Wine wine){
        //...
    }
}

class Wine {

}

class Pet {

}

class PetStore {
    private ArrayList<Pet> pets;

    public PetStore() {
        pets = new ArrayList<Pet>();
    }

    public void walk(Pet pet){
        //...
    }
}

class Salary {

}

class Employee {

    private Salary salary;

    public Employee() {
        Salary salary = new Salary();
    }
}