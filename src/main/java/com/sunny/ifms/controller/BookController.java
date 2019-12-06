package com.sunny.ifms.controller;

import com.sunny.ifms.config.JsonResult;
import com.sunny.ifms.entity.Book;
import com.sunny.ifms.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
  @Resource
  private BookService bookService;
  @RequestMapping(value = "/getList", method = RequestMethod.GET)
public JsonResult<?> getbook(){
  List<Book> list=bookService.getList();
  return new JsonResult(list);
}
}
