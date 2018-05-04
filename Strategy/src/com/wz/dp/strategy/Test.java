package com.wz.dp.strategy;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.strategy
 * @className: Test
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/30 18:57
 **/
public class Test {
    public static void main(String[] args) {
//        int[] arr = {23, 9, 10, 1, 5};
        Cat[] arr = {new Cat(5, 5), new Cat(1, 1), new Cat(3, 3)};
//        DataSorter.sort(arr);
        java.util.Arrays.sort(arr);
        DataSorter.print(arr);
    }
}
