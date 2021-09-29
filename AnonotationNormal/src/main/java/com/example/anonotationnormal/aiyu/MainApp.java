package com.example.anonotationnormal.aiyu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/9/29 2:22 下午
 * @description
 */

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beansZoo.xml");

        Zoo zoo = (Zoo)context.getBean("zoo");
        System.out.println(zoo);
    }
}
