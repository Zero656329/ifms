package com.sunny.ifms.controller;

import com.sunny.ifms.config.JsonResult;
import com.sunny.ifms.entity.Book;
import com.sunny.ifms.entity.User;
import com.sunny.ifms.service.BookService;
import com.sunny.ifms.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  @Resource
  private UserService userService;
  @RequestMapping(value = "/getList", method = RequestMethod.GET)
  public JsonResult<?> getuser(){
    List<User> list=userService.getList();
    return new JsonResult(list);
  }
}
