package example.events;

import example.commondomain.OrderDetails;

public class CustomerCreditReservedEvent implements DomainEvent {

  private Long orderId;
  private OrderDetails orderDetails;

  public CustomerCreditReservedEvent() {
  }

  public CustomerCreditReservedEvent(Long orderId, OrderDetails orderDetails) {
    this.orderId = orderId;
    this.orderDetails = orderDetails;
  }

  public Long getOrderId() {
    return orderId;
  }

  public OrderDetails getOrderDetails() {
    return orderDetails;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }
}
