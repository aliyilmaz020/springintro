package com.springframework.springintro;

public class MsSqlCustomerDal implements ICustomerDal {

  @Override
  public void add() {
    System.out.println("MsSql eklendi");
  }

}
