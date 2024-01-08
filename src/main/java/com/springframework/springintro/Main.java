package com.springframework.springintro;

public class Main {
  public static void main(String[] args) {
    CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
    manager.add();
  }
  // IoC - Inversion of Control : Birbirinin alternatifi olan işleri yönetiriz
  // Dependency Injection
  //
  // Spagetti
  // SOLID
}
