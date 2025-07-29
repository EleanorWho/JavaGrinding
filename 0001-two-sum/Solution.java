import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int i=0; i<nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i};
            } else {
                // If not, add the current number and its index to the map
                map.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}