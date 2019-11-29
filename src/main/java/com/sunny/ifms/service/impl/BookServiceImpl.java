package com.sunny.ifms.service.impl;

import com.sunny.ifms.dao.BookDao;
import com.sunny.ifms.entity.Book;
import com.sunny.ifms.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
@Resource
private BookDao bookDao;
  @Override
  public List<Book> getList() {
    return bookDao.selectAll();
  }
}
