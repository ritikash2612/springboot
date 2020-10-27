package com.springbootapp.webapp.books;

public class HelloWorldBean {
  private String msg;
  public HelloWorldBean(String s){
    msg =s;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  @Override
  public String toString() {
    return "HelloWorldBean{" +
        "msg='" + msg + '\'' +
        '}';
  }
}
