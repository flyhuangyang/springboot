package com.hy.springboot.domain;

import sun.rmi.runtime.Log;

import javax.persistence.*;
import java.util.Date;

/**
 * @author hy
 * @create 2018/10/29 0029
 * @description
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "generator", allocationSize = 1)
    private Long id;
    private String userName;
    private Date birthDay;
    private String sex;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
