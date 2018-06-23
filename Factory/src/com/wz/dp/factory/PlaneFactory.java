package com.wz.dp.factory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.factory
 * @className: PlaneFactory
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 14:04
 **/
public class PlaneFactory extends VehicleFactory {
    @Override
    public Moveable create() {
        return new Plane();
    }
}
