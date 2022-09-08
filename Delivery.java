public class Delivery {

    private int shoppingId;
    private String shoppingType;
    private int shippingCost;
    private int shippingRegionId;
    private String orderPlace;

    public Delivery(String orderPlace) {
        this.orderPlace = orderPlace;
    }
    public Delivery(int shoppingId, String shoppingType, int shippingCost, int shippingRegionId) {
        this.shoppingId = shoppingId;
        this.shoppingType = shoppingType;
        this.shippingCost = shippingCost;
        this.shippingRegionId = shippingRegionId;
    }
    public int getShippingCost() {
        return shippingCost;
    }
    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }
    public int getShippingRegionId() {
        return shippingRegionId;
    }
    public void setShippingRegionId(int shippingRegionId) {
        this.shippingRegionId = shippingRegionId;
    }
    public String getOrderPlace() {
        return orderPlace;
    }
    public void setOrderPlace(String orderPlace) {
        this.orderPlace = orderPlace;
    }

    public String updateShippingInfo(String orderPlace) {
        return orderPlace;
    }
}
