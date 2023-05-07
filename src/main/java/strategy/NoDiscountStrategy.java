package strategy;

public class NoDiscountStrategy implements PromoteStrategy {
    @Override
    public double discount(double price) {
        return price * 0.0;
    }
}
