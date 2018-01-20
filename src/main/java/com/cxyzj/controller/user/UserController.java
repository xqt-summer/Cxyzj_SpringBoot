package com.cxyzj.controller.user;

import com.cxyzj.service.userInfo.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 耿志强
 */

@RestController
@RequestMapping("/v1.0/front/users")
public class UserController {

    @Autowired
    UserService userService;


    /**
     * @author 耿志强
     */
    @PostMapping(value = "/register", produces = "application/json;charset=UTF-8")
    Map<String, Object> register(@RequestBody Map<String, String> request) {
        System.out.println(request);
        Map<String, Object> map = userService.userRegist(request.get("nickname"), request.get("email"), request.get("password"));

        return map;
    }


}
