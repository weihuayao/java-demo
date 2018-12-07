package test;

public class BubbleSort {

    public static void bubbleSort(int []arr) {
        for(int i =0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {//-1为了防止溢出
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];

                    arr[j]=arr[j+1];

                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] ary = {6, 4, 63, 44, 66};
        bubbleSort(ary);

        for (int arr1 : ary) {
            System.out.println(arr1);
        }

    }
}
