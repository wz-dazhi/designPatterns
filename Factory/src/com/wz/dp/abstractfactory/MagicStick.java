package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: MagicStick
 * @description: 魔法棒
 * @author: wangzhi
 * @createDate: 2018/6/23 15:34
 **/
public class MagicStick extends Weapon {
    @Override
    public void shoot() {
        System.out.println("fire hu hu hu...");
    }
}
