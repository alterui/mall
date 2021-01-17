package com.lr.netty.bio;

import lombok.Data;

import java.util.Arrays;

/**
 * @author liurui
 * @date 2020/12/9 3:04 下午
 */
@Data
public class Stu extends User {
    private String address;

    public static void main(String[] args) {
        int[] arr = new int[]{-54,-1, 3,-90 };
        Arrays.sort(arr);
        int i = Arrays.binarySearch(arr, -90);
        System.out.println(i);
    }
}
