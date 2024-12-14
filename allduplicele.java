package sorting;

import java.util.ArrayList;
import java.util.List;

public class allduplicele {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,6,6,4,3,7};
        System.out.println(missingNumber(arr));
    }
    static List<Integer> missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else i++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                 ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

