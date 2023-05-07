package strategy;

public class HalfDiscountStrategy implements PromoteStrategy {
    @Override
    public double discount(double price) {
        return price * 0.5;
    }
}
