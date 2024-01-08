package com.springframework.springintro;

public class MySqlCustomerDal implements ICustomerDal {

  @Override
  public void add() {
    System.out.println("MySql Eklendi");
  }

}
