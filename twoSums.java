// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.


import java.util.*;
public class twoSums {
	


    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int goal;

        for (int i = 0; i < nums.length; i++) {
            goal = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
            	if (goal == nums[j]) {
            		answer[0] = i;
            		answer[1] = j;
            	}
            }
        }
		return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
	    int target = 26;
	    int [] answer = twoSum(nums, target);

	    System.out.println(Arrays.toString(answer));
	}

}