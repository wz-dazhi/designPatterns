package com.wz;

/**
 * @projectName: designPatterns
 * @package: com.wz
 * @className: Plane
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/30 18:37
 **/
public class Plane extends Vehicle{
    @Override
    public void go(Address dest) {
        System.out.println("一路扇着翅膀,去了" + dest.getName());
    }
}
