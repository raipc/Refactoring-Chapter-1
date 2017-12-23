package bad.robot.refactoring.chapter1;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    @Getter
    private final String name;
    private final List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        final StringBuilder result = new StringBuilder();
        result.append("Rental record for ").append(getName()).append('\n');
        for (Rental rental : rentals) {
            double amount = rental.calculateAmount();
            frequentRenterPoints += rental.calculateRenterPoints();

            result.append('\t').append(rental.getMovie().getTitle()).append('\t').append(amount).append('\n');
            totalAmount += amount;
        }
        return result.append("Amount owed is ").append(totalAmount)
                .append("\nYou earned ").append(frequentRenterPoints).append(" frequent renter points")
                .toString();
    }
}
