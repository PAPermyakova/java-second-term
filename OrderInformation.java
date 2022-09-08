public class OrderInformation {

    private int orderId;
    private int productId;
    private String productName;
    private int tomatoesQuantity;
    private int meatQuantity;
    private int pastaQuantity;
    private float tomatoesCost; // цена за томаты
    private float meatCost;
    private float pastaCost;
    private float subtotal; // всего

    public OrderInformation(int tomatoesQuantity, int meatQuantity, int pastaQuantity, float tomatoesCost, float meatCost, float pastaCost) {
        this.tomatoesQuantity = tomatoesQuantity;
        this.meatQuantity = meatQuantity;
        this.pastaQuantity = pastaQuantity;
        this.tomatoesCost = tomatoesCost;
        this.meatCost = meatCost;
        this.pastaCost = pastaCost;
    }

    public OrderInformation(int orderId, int productId, String productName, int tomatoesQuantity, int meatQuantity, int pastaQuantity, float tomatoesCost, float meatCost, float pastaCost) {
        this.orderId = orderId;
        this.productId = productId;
        this.productName = productName;
        this.tomatoesQuantity = tomatoesQuantity;
        this.meatQuantity = meatQuantity;
        this.pastaQuantity = pastaQuantity;
        this.tomatoesCost = tomatoesCost;
        this.meatCost = meatCost;
        this.pastaCost = pastaCost;
        this.subtotal = subtotal;
    }

    public int getTomatoesQuantity() {
        return tomatoesQuantity;
    }
    public int getMeatQuantity() {
        return meatQuantity;
    }
    public int getPastaQuantity() {
        return pastaQuantity;
    }
    public float getTomatoesCost() {
        return tomatoesCost;
    }
    public float getMeatCost() {
        return meatCost;
    }
    public float getPastaCost() {
        return pastaCost;
    }

    public void calcPrice(float tomatoesCost, float meatCost, float pastaCost, int tomatoesQuantity, int meatQuantity, int pastaQuantity) {
        System.out.println("The subtotal is: " + (tomatoesCost * tomatoesQuantity + meatCost * meatQuantity + pastaCost * pastaQuantity));
    }
}
