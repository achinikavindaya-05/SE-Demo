package models;

public abstract class Person {
    protected int id;
    protected String name;
    protected String mobileNumber;

    public Person(int id, String name, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public abstract String getRole();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Contact: " + mobileNumber;
    }

}