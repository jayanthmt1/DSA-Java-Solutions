/*
 * Problem: Binary Search (Iterative)
 * Platform: LeetCode / Generic
 * * Time Complexity: O(log n) - The search space is halved in each step.
 * Space Complexity: O(1) - No extra space used (iterative approach).
 * * Logic:
 * 1. Initialize left and right pointers.
 * 2. Compare mid element with target.
 * 3. Adjust pointers based on comparison until target is found or pointers cross.
 */

public class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // Simple test case
        BinarySearch solver = new BinarySearch();
        int[] data = {1, 3, 5, 7, 9, 11};
        System.out.println("Found at index: " + solver.search(data, 7));
    }
}
