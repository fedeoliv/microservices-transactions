package samples.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import example.commondomain.OrderDetails;
import samples.models.OrderMock;
import samples.models.order.CreateOrderRequest;
import samples.models.order.CreateOrderResponse;
import samples.repositories.OrderRepositoryMock;
import samples.services.OrderServiceMock;

@RestController
public class OrderController {
    private OrderServiceMock orderService;
  
    @Autowired
    public OrderController(OrderServiceMock orderService) {
      this.orderService = orderService;
    }

    @RequestMapping(value = "/orders", method = RequestMethod.POST)
    public CreateOrderResponse createOrder(@RequestBody CreateOrderRequest createOrderRequest) {
        OrderDetails orderDetails = new OrderDetails(createOrderRequest.getCustomerId(), createOrderRequest.getOrderTotal());
        OrderMock order = orderService.createOrder(orderDetails);

        return new CreateOrderResponse(order.getId());
    }
}
