import java.util.ArrayList;

public class Client extends User {

    Date date = new Date(5, 12, 2022);
    private String customerName;
    private int customerID;
    private String address;
    private String email;
    private String creditCardInfo;
    private String shippingInfo;
    private float accountBalance;
    private ArrayList<Order> orders = new ArrayList<Order>(); // список заказов
    private ArrayList<Cart> carts = new ArrayList<Cart>(); // список корзин

    public Client(int customerID, String customerName, String address, String email, String creditCardInfo, String shippingInfo, float accountBalance, String password, String loginStatus, Date registerDate) {
        super(customerID, customerName, password, loginStatus, registerDate);
        this.customerName = customerName;
        this.customerID = customerID;
        this.address = address;
        this.email = email;
        this.creditCardInfo = creditCardInfo;
        this.shippingInfo = shippingInfo;
        this.accountBalance = accountBalance;
    }
    public float getBalance() {
        return accountBalance;
    }
    public void setBalance (float accountBalance) {
        this.accountBalance = accountBalance;
    }
    // добавление элемента в динамич массив
    public void addCart(Cart cart) {
        carts.add(cart);
    }
    // добавление элемента в динамич массив
    public void addOrder(Order order) {
        orders.add(order);
    }
    public void register() {
        System.out.println("User " + customerName + " was registed in " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
    public void login() {
        System.out.println("User " + customerName + " entered the system");
    }
    public void updateProfile() {
        System.out.println("Current balance is " + accountBalance);
    }
}
