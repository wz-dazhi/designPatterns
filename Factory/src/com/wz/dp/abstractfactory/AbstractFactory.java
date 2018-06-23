package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: AbstractFactory
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 15:19
 **/
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();

    public abstract Weapon createWeapon();

    public abstract Food createFood();
}
