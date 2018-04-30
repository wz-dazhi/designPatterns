package com.wz;

/**
 * @projectName: designPatterns
 * @package: com.wz
 * @className: Driver
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/30 18:26
 **/
public class Driver {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void driver(Vehicle vehicle){
        vehicle.go(new Address("东北"));
    }

}
