package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: Test
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 13:00
 **/
public class Test {
    public static void main(String[] args) {
        //AbstractFactory f = new DefaultFactory();
        AbstractFactory f = new MagicFactory();
        Vehicle v = f.createVehicle();
        v.run();
        Weapon w = f.createWeapon();
        w.shoot();
        Food a = f.createFood();
        a.printName();
    }
}
