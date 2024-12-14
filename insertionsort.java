package sorting;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3,0};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swapped(arr,j-1,j);
                }else break;
            }
        }
    }
    static void swapped(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second]=temp;
    }
}
