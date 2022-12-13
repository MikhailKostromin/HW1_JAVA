public class Task2 {
    //https://leetcode.com/problems/remove-element/
    public int removeElement(int[] nums, int val) {
        int copyInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[copyInd] = nums[i];
                copyInd += 1;
            }
        }
        return copyInd;
    }
}