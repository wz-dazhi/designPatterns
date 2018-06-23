package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: Broom
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 15:36
 **/
public class Broom extends Vehicle {
    @Override
    public void run() {
        System.out.println("一路沙尘暴扫着土...");
    }
}
