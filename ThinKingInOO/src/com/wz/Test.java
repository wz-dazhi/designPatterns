package com.wz;

/**
 * @projectName: designPatterns
 * @package: com.wz
 * @className: Test
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/30 18:36
 **/
public class Test {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setName("老张");
//        driver.driver(new Car());
        driver.driver(new Plane());
    }
}
