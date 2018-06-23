package com.wz.dp.factory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.factory
 * @className: CarFactory
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 14:03
 **/
public class CarFactory extends VehicleFactory {
    @Override
    public Moveable create() {
        return new Car();
    }
}
