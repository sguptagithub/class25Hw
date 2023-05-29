package class25Hw;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insurances = new ArrayList<>();

        Car carInsurance = new Car("Car Insurance", "ABC123");
        Pet petInsurance = new Pet("Pet Insurance", "Dog");
        Health healthInsurance = new Health("Health Insurance");

        insurances.add(carInsurance);
        insurances.add(petInsurance);
        insurances.add(healthInsurance);

            System.out.println("Using for loop:");
        for (int i = 0; i < insurances.size(); i++) {
            Insurance insurance = insurances.get(i);
            System.out.println("Insurance Name: " + insurance.getInsuranceName());
            System.out.println("Quote: " + insurance.getQuote());
            insurance.cancelInsurance();
            System.out.println("--------------------------");
        }

        System.out.println("\nUsing enhanced for loop:");
        for (Insurance insurance : insurances) {
            System.out.println("Insurance Name: " + insurance.getInsuranceName());
            System.out.println("Quote: " + insurance.getQuote());
            insurance.cancelInsurance();
            System.out.println("--------------------------");
        }

        System.out.println("\nUsing iterator:");
        Iterator<Insurance> iterator = insurances.iterator();
        while (iterator.hasNext()) {
            Insurance insurance = iterator.next();
            System.out.println("Insurance Name: " + insurance.getInsuranceName());
            System.out.println("Quote: " + insurance.getQuote());
            insurance.cancelInsurance();
            System.out.println("--------------------------");
        }
    }
}
