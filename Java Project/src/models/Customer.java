package models;

public class Customer extends Person {
    private String address;

    public Customer(int id,String name,String mobileNUmber,String address){
        super(id,name,mobileNUmber);
        this.address = address;
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    public String toString(){
        return super.toString() + "|Address :" + address;
    }
}
