package com.wz.dp.springfactory;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.springfactory
 * @className: Train
 * @description:
 * @author: wangzhi
 * @createDate: 2018/6/23 16:26
 **/
public class Train implements Moveable {
    @Override
    public void run() {
        System.out.println("小火车呜呜呜...");
    }
}
