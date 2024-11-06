package com.cy.sort;

//插入排序
public class InsertDemo {
    public static void main(String[] args) {
        int[] arr={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        int startindex=-1;

        //1.找出无序从哪一个开始
        //从前往后一个个确定数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                startindex=i+1;
                break;
            }
        }

        //2.遍历
        //某个数 从后往前找
        for (int i = startindex; i < arr.length; i++) {
            //记录当前要插入数据的索引
            int j=i;
            //因为下面索引值一直在变，不能直接用i
            while(j>0&&arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
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
