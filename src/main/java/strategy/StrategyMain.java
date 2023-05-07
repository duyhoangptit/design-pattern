package strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        ticket.setName("Iphone 15");
        ticket.setPrice(32_000_000);

        ticket.setPromoteStrategy(new HalfDiscountStrategy());
//        ticket.setPromoteStrategy(new QuarterDiscountStrategy());
//        ticket.setPromoteStrategy(new NoDiscountStrategy());

        System.out.println(ticket.getName() + " discount: " + ticket.getPromotedPrice());
    }

    private void funcTests(String fieldName) {

    }
}
