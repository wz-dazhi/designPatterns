package com.wz.dp.strategy;

/**
 * @projectName: designPatterns
 * @package: com.wz.dp.strategy
 * @className: DataSorter
 * @description:
 * @author: wangzhi
 * @createDate: 2018/4/30 18:59
 **/
public class DataSorter {

    /**
     * 排序(可以排序所有类型的数组)
     *
     * @param arr
     */
    public static void sort(Object[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                /*Comparable c1 = (Comparable) arr[j];
                Comparable c2 = (Comparable) arr[j - 1];*/
                // jdk中Comparable接口
                java.lang.Comparable c1 = (java.lang.Comparable) arr[j];
                java.lang.Comparable c2 = (java.lang.Comparable) arr[j - 1];
                if (c1.compareTo(c2) == -1) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    /**
     * 交换(Object类型)
     *
     * @param arr
     * @param x
     * @param y
     */
    private static void swap(Object[] arr, int x, int y) {
        Object temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    /**
     * 排序(只能排序int数组)
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }


    /**
     * 交换(int类型)
     *
     * @param arr
     * @param x
     * @param y
     */
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    /**
     * 打印
     *
     * @param arr
     */
    public static void print(Cat[] arr) {
        for (Cat i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * 打印
     *
     * @param arr
     */
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
