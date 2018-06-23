package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: AK47
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 14:55
 **/
public class AK47 extends Weapon {
    @Override
    public void shoot() {
        System.out.println("哒哒哒AK47...");
    }
}
