package com.sunny.ifms.service.impl;

import com.sunny.ifms.dao.UserDao;
import com.sunny.ifms.entity.User;
import com.sunny.ifms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
  @Resource
  private UserDao userDao;
  @Override
  public List<User> getList() {
    return userDao.selectAll();
  }
}
