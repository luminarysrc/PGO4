public class Main {
    public static void main(String[] args) {
        MenuItem coffee1 = new MenuItem("C01", "Espresso", 2.50, "Beverage");
        MenuItem coffee2 = new MenuItem("C02", "Latte", 3.50, "Beverage");
        MenuItem pastry = new MenuItem("F01", "Butter Croissant", 2.00, "Food");
        MenuItem coffee3 = new MenuItem("C01", "Cappuccino", 4.50, "Beverage");

        CafeCustomer customer = new CafeCustomer(1, "John", "Doe", "john.doe@example.com");

        Order order = new Order(customer);
        order.addItem(coffee1);
        order.addItem(coffee2);
        order.addItem(pastry);

        System.out.println("===== ORDER SUMMARY =====");
        System.out.println(order.toString());
        System.out.println("Total price: $" + order.calculateTotal());

        System.out.println("\nTotal MenuItem objects created: " + MenuItem.getProductCount());
        System.out.println("Next order number will be: " + Order.getNextOrderNumber());

        System.out.println("\n===== COMPARISON TESTS =====");
        System.out.println("coffee1 equals coffee2 (C01 vs C02): " + coffee1.equals(coffee2));
        System.out.println("coffee1 equals coffee3 (C01 vs C01): " + coffee1.equals(coffee3));

        CafeCustomer customer2 = new CafeCustomer(2, "Jane", "Doe", "john.doe@example.com");
        System.out.println("customer equals customer2 (different ID, same email): " + customer.equals(customer2));
    }
}
