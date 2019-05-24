package com.bugong.service;

import java.util.Map;

public interface LoginService {

    //userName是登陆名称

    //password是密码

    Map<String,Object> login(String userName, String password);

}


