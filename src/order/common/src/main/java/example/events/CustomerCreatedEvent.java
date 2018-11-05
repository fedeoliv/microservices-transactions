package example.events;

import example.commondomain.Money;

public class CustomerCreatedEvent implements DomainEvent {
  private String name;
  private Money creditLimit;

  public CustomerCreatedEvent() {
  }

  public CustomerCreatedEvent(String name, Money creditLimit) {
    this.name = name;
    this.creditLimit = creditLimit;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Money getCreditLimit() {
    return creditLimit;
  }

  public void setCreditLimit(Money creditLimit) {
    this.creditLimit = creditLimit;
  }
}
