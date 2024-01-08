package com.springframework.springintro;

public class CustomerManager implements ICustomerService { // extend ya da interface olmazsa bağımlılık olur

  private ICustomerDal customerDal;

  // Constructer Injection
  // public CustomerManager(ICustomerDal customerDal) {
  // this.customerDal = customerDal;
  // }

  // setter injection
  public void setCustomerDal(ICustomerDal customerDal) {
    this.customerDal = customerDal;
  }

  public void add() {
    // iş kuralları
    customerDal.add();
  }
}
