package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: DefaultFactory
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 15:04
 **/
public class DefaultFactory extends AbstractFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }

    @Override
    public Food createFood() {
        return new Apple();
    }
}
