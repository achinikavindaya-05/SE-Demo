package logic;

import models.*;

import java.security.Provider;
import java.util.ArrayList;

public class ServiceManager {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Mechanic> mechanics = new ArrayList<>();
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private ArrayList<Service> services = new ArrayList<>();
    private ArrayList<Invoice> invoices = new ArrayList<>();

    public void addCustomer(Customer cust){
        customers.add(cust);
        System.out.println("Customer added successfully.");
    }

    public void addMechanic(Mechanic mech){
        mechanics.add(mech);
        System.out.println("Mechanic added successfully.");
    }

    public void addVehicle(Vehicle vehi){
        vehicles.add(vehi);
        System.out.println("Vehicle added successfully.");
    }

    public void addService(Service serv){
        services.add(serv);
        Invoice invo = new Invoice(invoices.size()+1,serv);
        invoices.add(invo);
        System.out.println("Service recorded. Invoice generated.");
    }

    public Customer findCustomerByIDnum(int id){
        for (Customer cust:customers){
            if(cust.getId()==id)
                return cust;
        }
        return null;
    }

    public Mechanic findMechanicByIDnum(int id){
        for (Mechanic mech:mechanics){
            if (mech.getId()==id)
                return mech;
        }
        return null;
    }

    public Vehicle findVehicleByRegNum(String reg){
        for (Vehicle vehi:vehicles){
            if(vehi.getRegNumber().equalsIgnoreCase(reg))
                return vehi;
        }
        return null;
    }

    public void displayMechanics(){
        System.out.println("\n-------------Available Mechanics-------------");
        if (mechanics.isEmpty())
            System.out.println("No mechanics registered.");
        for (Mechanic mech:mechanics){
                System.out.println(mech);
        }
    }

    public void displayHistory(){
        System.out.println("\n-------------Service History-------------");
        if (services.isEmpty())
            System.out.println("No services recorded.");
        for (Service serv:services){
            System.out.println(serv);
            System.out.println("----------------------------------------");
        }
    }

    public void printFinalInvoice(){
        if (invoices.isEmpty()){
            System.out.println("No invoices found.");
        } else {
            invoices.get(invoices.size()-1).printInvoice();
        }
    }
}
