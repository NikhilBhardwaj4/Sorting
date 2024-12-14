package sorting;

public class Duplicateelement {
    public static void main(String[] args) {
        int[] arr = {5,4,3,3,1};
       // findDuplicate(arr);
        System.out.println(findDuplicate(arr));
    }


    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else return nums[i];
            } else i++;
        }
        return -1;
    }

    static void swap(int[] arr, int f, int l) {
        int temp = arr[f];
        arr[f]=arr[l];
        arr[l]=temp;
    }
}