package com.sunny.ifms.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
public class User {
  @Id
  private Integer id;
  private String cname;

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}
