package com.wz;

/**
 * @projectName: designPatterns
 * @package: com.wz
 * @className: Car
 * @description: 汽车类
 * @author: wangzhi
 * @createDate: 2018/4/30 18:27
 **/
public class Car extends Vehicle{

    @Override
    public void go(Address dest) {
        System.out.println("一路哼着歌,去了" + dest.getName());
    }

}
