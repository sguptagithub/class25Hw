package class25Hw;

import java.util.ArrayList;

public class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName
    and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute
    as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class. */
          private final String insuranceName;
        public Insurance(String insuranceName) {
            this.insuranceName = insuranceName;
        }

    public double getQuote() {
        return 0;
    }

    public void cancelInsurance() {

    }

    public String getInsuranceName() {
            return insuranceName;
        }
    }

    class Car extends Insurance {
        private String carModel;

        public Car(String insuranceName, String carModel) {
            super(insuranceName);
            this.carModel = carModel;
        }

        public double getQuote() {
            // Calculate car insurance quote
            // Implementation specific to Car class
            return 1000.0; // Dummy value for demonstration
        }

        public void cancelInsurance() {
            // Cancel car insurance
            // Implementation specific to Car class
            System.out.println("Car insurance canceled.");
        }

        public String getCarModel() {
            return carModel;
        }
    }

    class Pet extends Insurance {
        private String petType;

        public Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType = petType;
        }

        public double getQuote() {
            // Calculate pet insurance quote
            // Implementation specific to Pet class
            return 500.0; // Dummy value for demonstration
        }

        public void cancelInsurance() {
            // Cancel pet insurance
            // Implementation specific to Pet class
            System.out.println("Pet insurance canceled.");
        }

        public String getPetType() {
            return petType;
        }
    }

    class Health extends Insurance {
        public Health(String insuranceName) {
            super(insuranceName);
        }

        public double getQuote() {
            // Calculate health insurance quote
            // Implementation specific to Health class
            return 1500.0; // Dummy value for demonstration
        }

        public void cancelInsurance() {
            // Cancel health insurance
            // Implementation specific to Health class
            System.out.println("Health insurance canceled.");
        }
    }

