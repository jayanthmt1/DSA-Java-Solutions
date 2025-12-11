import java.util.*;

/*
 * Problem: Build an Array With Stack Operations (LeetCode 1441)
 * Difficulty: Medium
 * Topics: Stack, Array, Simulation
 * * Time Complexity: O(N) - Where N is the value of the last element in target. 
 * We iterate through the integer stream up to the largest target value.
 * Space Complexity: O(1) - Ignoring the space required for the output list.
 */

public class BuildArrayWithStackOps {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int stream = 1;
        
        for (int t : target) {
            // If current stream number is less than target, push and pop (skip it)
            while (stream < t) {
                result.add("Push");
                result.add("Pop");
                stream++;
            }
            // If current stream number matches target, just push
            result.add("Push");
            stream++;
        }
        return result;
    }
}
