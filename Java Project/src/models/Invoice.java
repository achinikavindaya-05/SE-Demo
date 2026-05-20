package models;

public class Invoice {
    private int invoiceID;
    private Service service;
    private double taxRate = 0.15;

    public Invoice(int ID, Service service) {
        invoiceID = ID;
        this.service = service;
    }

    public void printInvoice() {
        double total = service.getCost() + (service.getCost() * taxRate);

        System.out.println("=====================================");
        System.out.println("       SERVICE CENTRE INVOICE        ");
        System.out.println("=====================================");
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Service ID: " + service.getServiceID());
        System.out.println("Customer:   " + service.getVehicle().getOwner().getName());
        System.out.println("Vehicle:    " + service.getVehicle().getRegNumber());
        System.out.println("Mechanic:   " + service.getMechanic().getName());
        System.out.println("-------------------------------------");
        System.out.println("Base Cost:  Rs" + service.getCost());
        System.out.println("Tax (15%):  Rs" + (service.getCost() * taxRate));
        System.out.println("-------------------------------------");
        System.out.println("Total Bill: Rs" + total);
        System.out.println("=====================================");
    }
}

