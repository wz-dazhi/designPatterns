package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: Car
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 12:46
 **/
public class Car extends Vehicle {
    @Override
    public void run() {
        System.out.println("一路滴滴而来的car...");
    }
}
