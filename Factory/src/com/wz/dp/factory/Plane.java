package com.wz.dp.factory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.factory
 * @className: Plane
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 13:36
 **/
public class Plane implements Moveable {
    @Override
    public void run() {
        System.out.println("一路扇着翅膀飞奔而来plane...");
    }
}
