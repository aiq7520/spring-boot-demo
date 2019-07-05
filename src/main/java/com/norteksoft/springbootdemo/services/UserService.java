package com.norteksoft.springbootdemo.services;


import com.norteksoft.springbootdemo.entity.User;
import org.springframework.data.domain.Page;

import java.util.Optional;

/**
 * @author gege
 */
public interface UserService {
    /**
     * 分页查询 user list
     * @param pageNum 当前页数
     * @param pageSize 页面大小
     * @return user list page
     */
    Page<User> users (Integer pageNum,Integer pageSize);

    /**
     *持久化实体User对象
     * @param user transent entity
     * @return
     */
    User save(User user);

    /**
     *根据Id获取实体User对象
     * @param id
     * @return Optional<User>
     */
    Optional<User> get(Long id);

    /**
     *根据Id删除实体对象
     * @param id
     */
    void delete(Long id);
}
