package models;

public class Vehicle {
        private String vehicleId;
        private String brand;
        private String vehicleType;
        private Customer owner;

        public Vehicle(String vehicleId, String brand, String vehicleType, Customer owner) {
            this.vehicleId = vehicleId;
            this.brand = brand;
            this.vehicleType = vehicleType;
            this.owner = owner;
        }

        public String getRegNumber() {

            return vehicleId;
        }
        public Customer getOwner() {

            return owner;
        }

        @Override
        public String toString() {
            return "[" + vehicleId + "] " + brand + " " + vehicleType + " (Owner: " + owner.getName() + ")";
        }
}