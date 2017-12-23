package bad.robot.refactoring.chapter1;


import lombok.Getter;
import lombok.Setter;

@Getter
public class Movie {
    private final String title;
    @Setter
    private Price price;

    public Movie(String title, Price price) {
        this.title = title;
        this.price = price;
    }

}
