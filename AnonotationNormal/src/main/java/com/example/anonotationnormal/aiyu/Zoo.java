package com.example.anonotationnormal.aiyu;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ：luoyu
 * @version ：1.0
 * @date ： 2021/9/29 2:18 下午
 * @description
 */

public class Zoo {

    @Autowired
    private Tiger tiger;

    @Autowired
    private Monkey monkey;

    @Override
    public String toString() {
        return tiger + "\n" + monkey;
    }
}
