package com.lr.lambda;

/**
 * @author liurui
 * @date 2021/3/27 10:54
 */
public class TestBinarySearch {


    public static void main(String[] args) {
        //目标数组
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        //目标元素(可变)
        int target = 8;

        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = arr.length-1;
        //记录中间位置
        int mid = (begin+end)/2;
        //记录目标位置
        int index=-1;
        while(begin<=end) {
            //判断中间这个元素是不是要查找的元素
            if(arr[mid]==target) {
                index=mid;
                break;
                //若中间这个元素不是要查找的元素
            }else {
                //判断中间这个元素是不是比目标元素da
                if(arr[mid]>target) {
                    end=mid-1;
                    //中间这个元素比目标元素小
                }else {
                    //把开始位置调整到中间位置的后一个位置
                    begin = mid+1;
                }
                //取出新的中间位置
                mid=(begin+end)/2;
            }
        }
        System.out.println("index:"+index);
    }
    }
    //循环查找

