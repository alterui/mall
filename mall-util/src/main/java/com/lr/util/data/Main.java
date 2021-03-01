package com.lr.util.data;


/**
 * @author liurui
 * @date 2020/8/20 10:33 上午
 */
public class Main {
    public static void main(String[] args) {
        method2();
    }

    private static void method3() {
        int[] arr = {1, 0, -3, 4, 0, 0, 8, 11, -9, 1, 0, 0, 8, 21, -12};
        int begin = 0;
        int end = arr.length-1;
        for (int i = begin; i < end; i++) {
            if (arr[i] > 0) {
                begin++;
            }else {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
            }
            if (arr[end] <= 0) {
                end--;
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
    private static void method2() {
        int[] arr = {1, 0, -3, 4 , 0, 0, 8, 11, -9, 1, 0, 0, 8, 21, -12};
        System.out.println(arr.length);
        int begin = 0;
        int end = arr.length - 1;
        //0的左区间
        int left = 0;
        //是否有0的标志位
        int flag = -1;
        while (begin <= end) {
            if (arr[begin] < 0) {
                int temp = arr[begin];
                arr[begin] = arr[end];
                arr[end] = temp;
                end--;
            } else if (arr[begin] == 0) {
                if (flag == -1) {
                    left = begin;
                }
                flag++;
                begin++;
            } else {
                if (flag > -1) {
                    int temp = arr[begin];
                    arr[begin] = arr[left];
                    arr[left] = temp;
                    left++;
                }
                begin++;
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
        System.out.println(arr.length);

    }

    private static void method1() {
        int[] arr = {1, -3, 4, 10, -6, 9, -2, 5, 0, 9, -2, 0, 0};
        int[] left = new int[arr.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int middleIndex = 0;

        int[] right = new int[arr.length];
        int[] middle = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                left[leftIndex++] = arr[i];
            } else if (arr[i] < 0) {
                right[rightIndex++] = arr[i];
            } else {
                middle[middleIndex++] = arr[i];
            }
        }

        for (int i = 0; i < leftIndex; i++) {
            arr[i] = left[i];
        }
        for (int i = 0; i < middleIndex; i++) {
            arr[leftIndex + i] = middle[i];
        }

        for (int i = 0; i < rightIndex; i++) {
            arr[leftIndex + middleIndex + i] = right[i];
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}
