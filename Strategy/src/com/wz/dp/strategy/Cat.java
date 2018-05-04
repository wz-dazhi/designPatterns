package com.wz.dp.strategy;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.strategy
 * @className: Cat
 * @description:
 * @author: wangzhi
 * @createDate: 2018/5/5 0:25
 **/
//public class Cat implements Comparable {
public class Cat implements java.lang.Comparable<Cat> {
    /**
     * 高度
     */
    private int height;
    /**
     * 重量
     */
    private int weight;

    /**
     * 使用比较策略
     */
//    private Comparator comparator = new CatHeightComparator();
//    private Comparator comparator = new CatWeightComparator();
    private java.util.Comparator<Cat> comparator = new CatWeightComparator();

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * 自定义的Comparable接口,Comparator接口
     * @return
     */
    /*@Override
    public int compareTo(Object o) {
        *//*if (o instanceof Cat) {
            Cat cat = (Cat) o;
            if (this.height > cat.getHeight()) return 1;
            else if (this.height < cat.getHeight()) return -1;
        }
        return 0;*//*
        return comparator.compare(this, o);
    }*/

    /**
     * 使用jdk的Comparable接口,Comparator接口
     * @param o
     * @return
     */
    @Override
    public int compareTo(Cat o) {
        return comparator.compare(this, o);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }

}
