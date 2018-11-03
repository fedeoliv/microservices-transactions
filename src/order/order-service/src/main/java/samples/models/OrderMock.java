package samples.models;

import static java.util.Collections.singletonList;

import java.util.UUID;

import example.commondomain.OrderDetails;
import example.commondomain.OrderState;
import example.commondomain.ResultWithEvents;
import example.events.OrderCreatedEvent;

public class OrderMock {
  private String id;

  private OrderState state;
  private OrderDetails orderDetails;

  public OrderMock() {
  }

  public OrderMock(OrderDetails orderDetails) {
    this.id = UUID.randomUUID().toString();
    this.orderDetails = orderDetails;
    this.state = OrderState.PENDING;
  }

  public static ResultWithEvents<OrderMock> createOrder(OrderDetails orderDetails) {
    OrderMock order = new OrderMock(orderDetails);
    OrderCreatedEvent orderCreatedEvent = new OrderCreatedEvent(orderDetails);
    
    return new ResultWithEvents<>(order, singletonList(orderCreatedEvent));
  }

  public String getId() {
    return id;
  }

  public void noteCreditReserved() {
    this.state = OrderState.APPROVED;
  }

  public void noteCreditReservationFailed() {
    this.state = OrderState.REJECTED;
  }

  public OrderState getState() {
    return state;
  }

  public OrderDetails getOrderDetails() {
    return orderDetails;
  }
}
