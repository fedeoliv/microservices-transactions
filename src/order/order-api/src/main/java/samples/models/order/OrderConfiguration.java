package samples.models.order;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import samples.services.OrderServiceMock;

@Configuration
@EnableAutoConfiguration
public class OrderConfiguration {

  @Bean
  public OrderServiceMock orderService() {
    return new OrderServiceMock();
  }


  // @Bean
  // public CustomerEventConsumer orderEventConsumer() {
  //   return new CustomerEventConsumer();
  // }

  // @Bean
  // public DomainEventDispatcher domainEventDispatcher(CustomerEventConsumer customerEventConsumer, MessageConsumer messageConsumer) {
  //   return new DomainEventDispatcher("consumerServiceEvents", customerEventConsumer.domainEventHandlers(), messageConsumer);
  // }
}
