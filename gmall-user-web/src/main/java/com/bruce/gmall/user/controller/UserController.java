package com.bruce.gmall.user.controller;

//替换两个bean的依赖

import com.alibaba.dubbo.config.annotation.Reference;
import com.bruce.gmall.bean.UmsMember;
import com.bruce.gmall.bean.UmsMemberReceiveAddress;
import com.bruce.gmall.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2021/3/17 10:13
 */

@RestController
public class UserController {
    @Reference
    UserService userService;

//    根据用户ID查询用户的收货地址
    @RequestMapping("getReceiveAddressByMemberId")
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    //    查询所有用户信息
    @RequestMapping("/getAllUser")
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }
    @RequestMapping("/index")
    public String index() {
        return "hello user";
    }
}
