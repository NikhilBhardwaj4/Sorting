package sorting;

class missingnumber {
    public static void main(String[] args) {

        int[] arr={1,2,2};
        System.out.println(missingNumber(arr));
    }
    static int[] missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else i++;
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                return new int [] {nums[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }

    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}