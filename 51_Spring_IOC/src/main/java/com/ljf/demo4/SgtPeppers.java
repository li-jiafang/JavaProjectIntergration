package com.ljf.demo4;

import org.springframework.stereotype.Component;

/**
 * @author: ljf
 * @create: 2021-02-25 10:39
 * @description:
 **/

@Component
public class SgtPeppers implements CompactDisc{
    @Override
    public void player() {
        System.out.println("SgtPeppers");
    }
}
