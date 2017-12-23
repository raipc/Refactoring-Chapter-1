package bad.robot.refactoring.chapter1;

public enum Price {
    REGULAR {
        @Override
        public double calculateAmount(int daysRented) {
            return 2 + getPenalty(daysRented, 2, 1.5);
        }
    },
    CHILDREN {
        @Override
        public double calculateAmount(int daysRented) {
            return 1.5 + getPenalty(daysRented, 3, 1.5);
        }
    },
    NEW_RELEASE {
        @Override
        public double calculateAmount(int daysRented) {
            return daysRented * 3.0;
        }

        @Override
        public int calculateRenterPoints(int daysRented) {
            return daysRented > 1 ? 2 : 1;
        }
    };

    protected final double getPenalty(int daysRented, int minDaysForPenalty, double factor) {
        return Math.max(daysRented - minDaysForPenalty, 0) * factor;
    }

    public abstract double calculateAmount(int daysRented);

    public int calculateRenterPoints(int daysRented) {
        return 1;
    }

}
