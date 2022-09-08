public class Cart {

    private int size;
    private int cartId;
    private int productID;
    private int quantity; // количество
    private Product data;
    private Product head;
    private Product tail;

    public Cart(int cartId, int productID, int quantity) {
        this.cartId = cartId;
        this.productID = productID;;
        this.quantity = quantity;
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public void addCartItem(String data) {
        Product temp = new Product(data);
        if (head == null) {
            head = temp;
            temp.next = null;
        } else {
            tail.next = temp;
        }
        temp.prev = tail;
        tail = temp;
    }

    public int updateQuantity() {
        Product current = head;
        size = 0;
        if (head == null) {
            return 0;
        } else {
            do {
                current = current.next;
                ++size;
            } while (current != null);
            return size;
        }
    }
    // просмотр сведений о корзине
    public void viewCartDetails() {
        System.out.println("cart ID is: " + cartId + ", product ID is: " + productID  + ", quantity of products is: " + quantity);
    }

    public void checkOut() {
        StringBuffer str = new StringBuffer();
        Product current = head;
        if (current == null) {
            System.out.println("Empty");
        } else {
            do {
                str.append(current.data);
                if (current != tail) {
                    str.append(", ");
                }
                current = current.next;
            } while (current != null);
            System.out.println("Cart includes: " + str.toString() + ".");
        }
    }
}
