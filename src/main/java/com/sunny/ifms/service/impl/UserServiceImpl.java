package com.sunny.ifms.service.impl;

import com.sunny.ifms.dao.UserDao;
import com.sunny.ifms.entity.User;
import com.sunny.ifms.service.UserService;
import com.sunny.ifms.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
  @Resource
  private UserDao userDao;
  @Autowired
  private RedisTemplate<String, Object> redisTemplate;

  @Override
  public List<User> getList() {
    List<User> users=userDao.selectAll();
    redisTemplate.opsForValue().set("user",users);
    return users;
  }
}
