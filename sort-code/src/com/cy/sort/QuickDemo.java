package com.cy.sort;

//快速排序
//递归思想
public class QuickDemo {
    public static void main(String[] args) {
        int[] arr={1,6,2,7,9,3,4,5,10,8};
        quickSort(arr,0,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int[] arr,int i,int j){
        int start=i;
        int end=j;

        if(start>end){
            return;
        }

        //基准数
        int baseNumber=arr[i];
        //
        while(start!=end){
            //end
            while(true){
                if(end<=start||arr[end]<baseNumber){
                    break;
                }
                end--;
            }
            while(true){
                if(end<=start||arr[start]>baseNumber){
                    break;
                }
                start++;
            }
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

        //基准数与start=end的位置交换(基准数归位）
        int temp=arr[i];
        arr[i]=arr[start];
        arr[start]=temp;

        //递归
        //左边
        quickSort(arr,i,start-1);
        //右边
        quickSort(arr,start+1,j);
    }
}
