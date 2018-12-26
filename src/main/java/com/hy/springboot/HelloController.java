package com.hy.springboot;

import com.hy.springboot.domain.User;
import com.hy.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/save")
    public String save(){
        for (int i=0; i<10; i++){
            User user = new User();
            user.setUserName("ss"+i);
            user.setSex(i%2==0?"男":"女");
            user.setBirthDay(new Date());
            user.setAddress("fd"+i);
            userRepository.save(user);
        }
        return "save";
    }

    @RequestMapping("/hello")
    public String hello(){
//        User user = userRepository.getOne(1L);
//        User userOne = userRepository.findOne(1L);
//        User user = userRepository.findUserByUserName("dl"+2);
//        return user.getAddress();
//        System.out.println(userRepository.findAll().size());
//        return userRepository.findUserByUserName("ss"+3).getAddress();
        return null;
    }

}
