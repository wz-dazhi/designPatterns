package com.wz.dp.strategy;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.strategy
 * @className: CatHeightComparator
 * @description:
 * @author: wangzhi
 * @createDate: 2018/5/5 0:38
 **/
//public class CatWeightComparator implements Comparator {
public class CatWeightComparator implements java.util.Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getWeight() > o2.getWeight()) return -1;
        else if (o1.getWeight() < o2.getWeight()) return 1;
        else return 0;
    }

    /*@Override
    public int compare(Object o1, Object o2) {
        Cat c1 = (Cat) o1;
        Cat c2 = (Cat) o2;
        if (c1.getWeight() > c2.getWeight()) return -1;
        else if (c1.getWeight() < c2.getWeight()) return 1;
        else return 0;
    }*/
}
