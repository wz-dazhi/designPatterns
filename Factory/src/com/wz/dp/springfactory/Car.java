package com.wz.dp.springfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.springfactory
 * @className: Car
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 12:46
 **/
public class Car implements Moveable {
    @Override
    public void run() {
        System.out.println("一路滴滴而来的car...");
    }
}
