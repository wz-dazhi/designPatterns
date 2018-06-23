package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: MagicFactory
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 15:33
 **/
public class MagicFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Mushroom();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }
}
