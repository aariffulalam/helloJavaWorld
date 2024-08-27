// Max Consecutive Ones (leetcode 485)
/**
 * first time i have tried to do code in java using of operators, if else and loops
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Integer count = 0;
        Integer current = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                current += 1;
                if (current > count){
                    count += 1;
                }
            } else {
                current = 0;
            }
        }
        return count;
    }
}