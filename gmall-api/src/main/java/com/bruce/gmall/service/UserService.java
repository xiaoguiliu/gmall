package com.bruce.gmall.service;

import com.bruce.gmall.bean.UmsMember;
import com.bruce.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2021/3/17 10:14
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
