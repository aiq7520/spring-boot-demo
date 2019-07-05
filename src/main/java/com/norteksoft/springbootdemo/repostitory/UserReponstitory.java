package com.norteksoft.springbootdemo.repostitory;

import com.norteksoft.springbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author gege
 */
public interface UserReponstitory extends JpaRepository<User,Long> {

}
