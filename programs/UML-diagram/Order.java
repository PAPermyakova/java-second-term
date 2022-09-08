public class Order {

    private int orderId;
    private String dateCreated; // дата создания
    private String dateShipped; // дата отгрузки
    private String customerName; // имя клиента
    private String customerId;
    private String status;
    private String shippingId;
    private Delivery delivery;
    private OrderInformation information;
    private Cart products;

    public Order() {
    }

    public Order(int orderId, String dateCreated, String dateShipped, String customerName, String customerId, String status, String shippingId, OrderInformation information) {
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.customerId = customerId;
        this.status = status;
        this.shippingId = shippingId;
        this.information = information;
    }

    public void placeOrder() {
        System.out.println("The quantity of tomatoes is: " + information.getTomatoesQuantity() + ", the quantity of meat is: " + information.getMeatQuantity() + ", the quantity of pasta is: " + information.getPastaQuantity());
        System.out.println("The unit cost of tomato is: " + information.getTomatoesCost() + ", the cost of meat packaging: " + information.getMeatCost() + ", the cost of pasta box: " + information.getPastaCost());
    }
}
