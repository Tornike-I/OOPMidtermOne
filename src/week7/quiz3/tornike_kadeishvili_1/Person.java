package week7.quiz3.tornike_kadeishvili_1;

public class Person {
    String id;
    String name, surname;

    // Constructor with parameters
    public Person(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // No-argument constructor
    public Person() {
        // Initialize fields with default values
        this.id = "";
        this.name = "";
        this.surname = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}