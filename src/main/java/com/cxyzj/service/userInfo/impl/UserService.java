package com.cxyzj.service.userInfo.impl;

import com.cxyzj.domain.userInfo.User;
import com.cxyzj.domain.userInfo.mapper.UserMapper;
import com.cxyzj.service.userInfo.UserServiceInterface;
import com.cxyzj.utils.*;
import com.sun.javafx.binding.SelectBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author 耿志强
 */
@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserMapper userMapper;

    @Override
    /**
     * @author 耿志强
     */
    public Map<String, Object> userRegist(String nickname, String email, String password) {
        User user = new User(nickname, email, password);
        Response response;//服务器响应
        if (userMapper.isExist(email)) {
            response = new Failure("邮箱已存在，操作失败！");
        } else {
            //todo 默认用户设置需要修改
            user.setHead_url("C:/cxyzjStatic/head_url/head01.jpg");      //默认头像
            user.setIs_admin(false);                  //注册之后，默认为普通用户权限。
            user.setIntroduce("这个人很懒。。。。。");                  //默认个人简介
            user.setGender("不明");                     //默认性别
            user.setBg_url("C:/cxyzjStatic/user/bg_url/bgurl01.jpg");
            user.setUser_id(ID.Get());
            user.setRegister_date(System.currentTimeMillis());
            userMapper.registerUser(user);
            SelectBinding.AsDouble

            //response 对象
            response = new Success();
            response.insert("access_token", "fuck");
            response.insert("user", user);
        }
        return response.get();
    }

    @Override
    /*
     *
     * 在这里署名
     *
     * */
    public Map<String, Object> userLogin(String email, String password) {

        return null;
    }
}
