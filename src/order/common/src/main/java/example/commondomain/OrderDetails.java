package example.commondomain;

public class OrderDetails {
    private Long customerId;
    private Money orderTotal;

    public OrderDetails() {
    }

    public OrderDetails(Long customerId, Money orderTotal) {
        this.customerId = customerId;
        this.orderTotal = orderTotal;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Money getOrderTotal() {
        return orderTotal;
    }
}
