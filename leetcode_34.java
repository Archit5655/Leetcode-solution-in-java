package arrayandaarlist;

public class leetcode_34 {
//    Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
public int[] searchRange(int[] nums, int target) {
    int[] ans={-1,-1};
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
            ans[0] = i;
            break;
        }
    }
        if (nums.length > 1) {

            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[j] == target) {
                    ans[1] = j;
                    break;
                }
            }
        }
        else if (nums.length==1){
            if (nums[0]==target){
                ans[0]=0;
                ans[1] = 0;
                return ans;
            }
        }
    return ans;

}
}
