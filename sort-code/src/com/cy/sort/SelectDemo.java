package com.cy.sort;

//选择排序
public class SelectDemo {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,1};
        //外循环：几轮
        for (int i = 0; i < arr.length-1; i++) {
            //内循环：拿i和i后面的比较
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
