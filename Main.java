public class Main {
    public static void main(String[] args) {
        MenuItem coffee1 = new MenuItem("C01", "Espresso", 2.50, "Beverage");
        MenuItem coffee2 = new MenuItem("C02", "Latte", 3.50, "Beverage");
        MenuItem pastry = new MenuItem("F01", "Butter Croissant", 2.00, "Food");
        MenuItem coffee3 = new MenuItem("C01", "Cappuccino", 4.50, "Beverage");

        Customer customer = new Customer("John", "Doe", "john.doe@example.com");

        Order order = new Order(customer);
        order.addItem(coffee1);
        order.addItem(coffee2);
        order.addItem(pastry);

        System.out.println("===== ORDER SUMMARY =====");
        order.printSummary();

        System.out.println("\nTotal MenuItem objects created: " + MenuItem.getProductCount());
        System.out.println("\n===== COMPARISON TESTS =====");
        System.out.println("coffee1 equals coffee2 (C01 vs C02): " + coffee1.equals(coffee2));
        System.out.println("coffee1 equals coffee3 (C01 vs C01): " + coffee1.equals(coffee3));
    }
}
