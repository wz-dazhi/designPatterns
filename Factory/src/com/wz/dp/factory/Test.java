package com.wz.dp.factory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.factory
 * @className: Test
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 13:00
 **/
public class Test {
    public static void main(String[] args) {
//        Car car = Car.getInstance();
        VehicleFactory factory = new PlaneFactory();
        Moveable m = factory.create();
        m.run();
    }
}
