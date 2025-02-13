package Arrays;

public class _0035_SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start  <= end ){
            int mid = start + (end-start)/2;

            if(target > nums[mid]) {
                start = mid + 1;
            }
            else if (target < nums[mid]) {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return start;
    }


    public static void main(String[] args) {
        int[] nums = {1,3,5,6,8};
        int target = 7;

        int ans = searchInsert(nums, target);
        System.out.println(ans);

    }
}
