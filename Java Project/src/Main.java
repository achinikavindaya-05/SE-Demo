import logic.ServiceManager;
import models.Customer;
import models.Mechanic;
import models.Vehicle;
import models.Service;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceManager manager = new ServiceManager();
        Scanner scanner = new Scanner(System.in);

        manager.addMechanic(new Mechanic(1,"Kasun Rukshan","0715568975","Paint Specialist"));
        manager.addMechanic(new Mechanic(2,"Sandun Rajapaksha","0775632145","Engine Specialist"));

        while (true){
            System.out.println("========================================================");
            System.out.println("||\t\tVehicle Service Center Management System\t  ||");
            System.out.println("========================================================");;
            System.out.println("1. Register New Customer");
            System.out.println("2. Register New Vehicle");
            System.out.println("3. Add New Mechanic");
            System.out.println("4. Create Service Record");
            System.out.println("5. View Service History");
            System.out.println("6. Print Last Invoice");
            System.out.println("7. Exit");
            System.out.println("Select Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int CustID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String CustName = scanner.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    String CustMob = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String CustAddress = scanner.nextLine();

                    Customer newCust = new Customer(CustID,CustName,CustMob,CustAddress);
                    manager.addCustomer(newCust);
                    break;

                case 2:
                    System.out.print("Enter Vehicle Reg Number: ");
                    String reg = scanner.nextLine();
                    System.out.print("Enter Vehicle Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Vehicle Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Owner ID: ");
                    int ownerId = scanner.nextInt();

                    Customer owner = manager.findCustomerByIDnum(ownerId);
                    if (owner != null) {
                        Vehicle newVehi = new Vehicle(reg, brand, model, owner);
                        manager.addVehicle(newVehi);
                    } else {
                        System.out.println("Error: Customer not found! Register Customer first.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Mechanic ID: ");
                    int mechaId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Mechanic Name: ");
                    String mechaName = scanner.nextLine();
                    System.out.print("Enter Mechanic Phone Num.: ");
                    String mechaPhone = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String spec = scanner.nextLine();

                    manager.addMechanic(new Mechanic(mechaId, mechaName, mechaPhone, spec));
                    break;
                case 4:
                    System.out.print("Enter Service ID: ");
                    int servId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Vehicle Reg Number: ");
                    String vehiReg = scanner.nextLine();
                    Vehicle vehi = manager.findVehicleByRegNum(vehiReg);

                    manager.displayMechanics();
                    System.out.print("Enter Mechanic ID to Assign: ");
                    int mechId = scanner.nextInt();
                    Mechanic mecha = manager.findMechanicByIDnum(mechId);
                    scanner.nextLine();

                    if (vehi != null && mecha != null) {
                        System.out.print("Enter Service Description: ");
                        String desc = scanner.nextLine();
                        System.out.print("Enter Cost: ");
                        double cost = scanner.nextDouble();

                        Service newService = new Service(servId, vehi, mecha, desc, cost);
                        manager.addService(newService);
                    } else {
                        System.out.println("Error: Invalid Vehicle or Mechanic ID.");
                    }
                    break;
                case 6:
                    manager.printFinalInvoice();
                    break;

                case 7:
                    System.out.println("Exiting System...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}
