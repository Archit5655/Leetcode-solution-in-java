package arrayandaarlist;

import java.util.ArrayList;
import java.util.Arrays;

public class leetcode1480 {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        int sum=0;
//        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i]=sum;
        }

//        return Arrays.toString();
        //
        return nums;
    }

}
