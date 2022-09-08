public class Main {

    public static void main(String[] args) {

        User user = new User();
        Date date = new Date();
        Administrator admin = new Administrator(2713507, "Petrov Ivan", "PetrovIvan@gmail.com", "1234", "online", date);
        Client customer = new Client(5071327, "Ivanov Peter", "Moscow city", "Ivanov@gmail.com", "9876543210987654", "flat 5", 2534, "4321", "online", date);
        Cart cart = new Cart(123, 34, 5);
        OrderInformation information = new OrderInformation(6, 1, 2, 75, 240, 87);
        Order order = new Order(451, "24/05/22", "26/05/22", "Andrew", "987", "collected", "4958", information);
        Delivery delivery = new Delivery("in the stock");
        user.verifyLogin();
        admin.appear();
        admin.updateCatalog();
        customer.register();
        customer.login();
        customer.updateProfile();
        customer.setBalance(24000);
        customer.updateProfile();
        cart.viewCartDetails();
        cart.checkOut();
        cart.updateQuantity();
        cart.addCartItem("tomatoes");
        cart.checkOut();
        cart.updateQuantity();
        cart.addCartItem("meat");
        cart.checkOut();
        cart.updateQuantity();
        cart.addCartItem("pasta");
        cart.checkOut();
        cart.updateQuantity();
        customer.addCart(cart);
        customer.addOrder(order);
        order.placeOrder();
        information.calcPrice(information.getTomatoesCost(), information.getMeatCost(), information.getPastaCost(), information.getTomatoesQuantity(), information.getMeatQuantity(), information.getPastaQuantity());
        System.out.println("The order is " + delivery.updateShippingInfo(delivery.getOrderPlace()));
        delivery.setOrderPlace("on the way");
        System.out.println("The order is " + delivery.updateShippingInfo(delivery.getOrderPlace()));
        delivery.setOrderPlace("ready to receive");
        System.out.println("The order is " + delivery.updateShippingInfo(delivery.getOrderPlace()));
    }
}
