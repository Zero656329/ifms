package com.sunny.ifms.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "book")
public class Book {
  @Id
  private Integer id;
}
