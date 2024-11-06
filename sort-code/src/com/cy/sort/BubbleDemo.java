package com.cy.sort;

//冒泡排序
//找出最大
public class BubbleDemo {
    public static void main(String[] args) {
    int[] arr={2,4,5,3,1};

    //外循环：执行多少轮
        for (int i = 0; i < arr.length-1; i++) {
            //内循环：找出当前最大值
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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
