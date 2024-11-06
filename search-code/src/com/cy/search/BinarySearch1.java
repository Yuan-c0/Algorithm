package com.cy.search;

//二分查找/折半查找

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr={7,23,79,81,103,127,131,147};
        int number=131;
        System.out.println(binarySearch(arr,number));
    }

    public static int binarySearch(int[] arr,int number){
        //1.定义两个变量记录要查找的范围
        int min=0;
        int max=arr.length-1;

        while(true) {
            if (min > max) {
                return -1;
            }
            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
