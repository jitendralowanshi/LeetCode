package Arrays;

public class _26_removeDuplicatesFromSortedArrays {
    public static int removeDuplicates(int[] nums) {
        int k = 1;
        int index = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                k++;
                nums[index++] = nums[i];
            }
        }
        for(int jk: nums) {
            System.out.print(jk+" ");
        }
        return k;
    }



    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int ans = removeDuplicates(nums);
        System.out.println();
        System.out.println(ans);

    }
}
