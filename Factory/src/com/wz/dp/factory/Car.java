package com.wz.dp.factory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.factory
 * @className: Car
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 12:46
 **/
public class Car implements Moveable {

    private static final Car CAR = new Car();

    //private Car(){}

    public static Car getInstance() {
        return CAR;
    }

    @Override
    public void run() {
        System.out.println("一路滴滴而来的car...");
    }
}
