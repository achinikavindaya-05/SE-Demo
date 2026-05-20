package models;

public class Mechanic extends Person{
    private String expertise;

    public Mechanic(int id, String name,  String contactNumber, String expertise){
        super(id, name, contactNumber);
        this.expertise = expertise;
    }
    public String getExpertise(){

        return expertise;
    }

    public String getRole(){

        return "Mechanic";
    }

    public String toString(){

        return super.toString() + "|Expert: " + expertise;
    }
}
