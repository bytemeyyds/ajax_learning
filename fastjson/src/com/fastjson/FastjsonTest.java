package com.fastjson;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class FastjsonTest {
    public static void main(String[] args) {
        User user = new User("123", "zhangsan", 20);

        //将以上的user对象转换成json格式的字符串
        //使用阿里的fastjson组件中的JSON组件即可
        //fastjson中有一个类，叫做JSON,全部大写
        //JSON类中的方法都是静态的方法，直接调用即可
        String s = JSON.toJSONString(user);
        System.out.println(s);

        //尝试list集合是否可以转换成json对象
        List<User> userList = new ArrayList<>();
        User user1 = new User("5", "lisi", 30);
        User user2 = new User("6", "wangwu", 60);
        userList.add(user1);
        userList.add(user2);

        String s1 = JSON.toJSONString(userList);
        System.out.println(s1);
    }
}
