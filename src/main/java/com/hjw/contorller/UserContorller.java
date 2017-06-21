package com.hjw.contorller;

import com.hjw.domain.User;
import com.hjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

/**
 * Created by 黄毅 on 2017/6/21.
 */
@Controller
public class UserContorller {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String selectUser(ModelMap modelMap){
        List<User> users = this.userService.getUser();
        modelMap.put("users",users);
        return "user";
    }
}
