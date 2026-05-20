package models;
import java.time.LocalDate;
public class Service {
    private int serviceID;
    private Vehicle vehicle;
    private Mechanic mechanic;
    private String description;
    private double cost;
    private LocalDate date;
    public Service(int ID, Vehicle vehicle, Mechanic mechanic, String description, double cost) {
        this.serviceID = ID;
        this.vehicle = vehicle;
        this.mechanic = mechanic;
        this.description = description;
        this.cost = cost;
        this.date = LocalDate.now();
    }
    public double getCost() {
        return cost;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public Mechanic getMechanic() {
        return mechanic;
    }
    public String getDescription() {
        return description;
    }
    public int getServiceID() {
        return serviceID;
    }

    @Override
    public String toString() {
        return "Service ID: " + serviceID + " | Date: " + date +
                "\n   Vehicle: " + vehicle.getRegNumber() +
                "\n   Mechanic: " + mechanic.getName() +
                "\n   Desc: " + description + " | Cost: Rs" + cost;
    }
}
