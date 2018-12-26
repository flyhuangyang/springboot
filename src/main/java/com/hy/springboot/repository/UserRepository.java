package com.hy.springboot.repository;

import com.hy.springboot.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;

/**
 * @author hy
 * @create 2018/10/29 0029
 * @description
 */
public interface UserRepository extends JpaRepository<User, Long> {

//    public User findOne(Long id);
//    public User save(User user);
//
//    @Query("SELECT t FROM user t where t.userName=:name")
//    public User findUserByUserName(@Param("name") String name);
//    @Query("SELECT t FROM User t where t.user_name=:name")
//    public User findUserByUserName(@Param("name") String name);

    public User findUserByUserName(String userName);
}
