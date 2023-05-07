package strategy;

public class QuarterDiscountStrategy implements PromoteStrategy {
    @Override
    public double discount(double price) {
        return price * 0.9;
    }
}
