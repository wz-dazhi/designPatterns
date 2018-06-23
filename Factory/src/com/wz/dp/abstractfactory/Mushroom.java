package com.wz.dp.abstractfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.abstractfactory
 * @className: Mushroom
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 15:37
 **/
public class Mushroom extends Food {
    @Override
    public void printName() {
        System.out.println("毒蘑菇...");
    }
}
