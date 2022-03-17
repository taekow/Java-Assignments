public class TestOrder {

    public static void main(String[] args) {
        
        // Menu items
        Item item1 = new Item("cappuccino");
        Item item2 = new Item("Drip Coffee");
        Item item3 = new Item("Latte");
        Item item4 = new Item("Mocha Latte");

        //Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders with customer's name
        Order order3 = new Order("Adam");
        Order order4 = new Order("Emmily");
        Order order5 = new Order("Jimmy");

        // Add at least 2 items to each of the orders using the addItem method you wrote, 
        // for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        Order3.addItem(item2);
        Order2.addItem(item3);

        // Implement the getStatusMessage method within the Order class
        System.out.println(order3.getStatusMessage());

        // The total by printing the return value like so: System.out.println(order1.getOrderTotal());

        // Implement the display method within the Order class

        // call the display method on all of your orders, like so: order3.display();
    }
    
}
