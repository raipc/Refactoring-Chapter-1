package bad.robot.refactoring.chapter1;

import lombok.Getter;

@Getter
public class Rental {

    private final Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double calculateAmount() {
        return movie.getPrice().calculateAmount(daysRented);
    }

    public int calculateRenterPoints() {
        return movie.getPrice().calculateRenterPoints(daysRented);
    }

}
