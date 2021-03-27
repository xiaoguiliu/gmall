package com.bruce.gmall.user.service.impl;
//替换下面两个bean的依赖
import com.bruce.gmall.bean.UmsMember;
import com.bruce.gmall.bean.UmsMemberReceiveAddress;

import com.bruce.gmall.service.UserService;
import com.bruce.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.bruce.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2021/3/17 10:15
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override

    public List<UmsMember> getAllUser() {
//        xml配置文件写sql方法
//        List<UmsMember> umsMembers = userMapper.selectAlluser();
//        Mapper工具类写sql方法
        List<UmsMember> umsMembers = userMapper.selectAll();

        return umsMembers;
    }

//    根据用户ID查询用户收获地址
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//        创建参数pojo对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//        封装参数到pojo对象中
        umsMemberReceiveAddress.setMemberId(memberId);
//        调用Mapper工具类提供的方法查询数据库。selec方法会根据传入的参数作为查询条件自动生成查询sql语句操作数据库。
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
