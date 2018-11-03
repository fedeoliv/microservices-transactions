package samples.services;

import org.springframework.beans.factory.annotation.Autowired;
import example.commondomain.OrderDetails;
import example.commondomain.ResultWithEvents;
import samples.models.OrderMock;
import samples.repositories.OrderRepositoryMock;

public class OrderServiceMock {

//   @Autowired
//   private DomainEventPublisher domainEventPublisher;

  @Autowired
  private OrderRepositoryMock orderRepository;

  public OrderMock createOrder(OrderDetails orderDetails) {
    ResultWithEvents<OrderMock> orderWithEvents = OrderMock.createOrder(orderDetails);
    OrderMock order = orderWithEvents.result;

    orderRepository.save(order);
    // domainEventPublisher.publish(Order.class, order.getId(), orderWithEvents.events);
    
    return order;
  }

  // public void approveOrder(Long orderId) {
  //   Order order = orderRepository.findOne(orderId);

  //   order.noteCreditReserved();
  //   // domainEventPublisher.publish(Order.class,
  //   //         orderId, singletonList(new OrderApprovedEvent(order.getOrderDetails())));
  // }

  // public void rejectOrder(Long orderId) {
  //   Order order = orderRepository.findOne(orderId);
    
  //   order.noteCreditReservationFailed();
  //   // domainEventPublisher.publish(Order.class,
  //   //         orderId, singletonList(new OrderRejectedEvent(order.getOrderDetails())));
  // }
}
