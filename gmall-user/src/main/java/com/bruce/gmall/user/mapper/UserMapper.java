package com.bruce.gmall.user.mapper;

import com.bruce.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author: Bruce
 * @Date: 2021/3/17 10:19
 */
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAlluser();
}
