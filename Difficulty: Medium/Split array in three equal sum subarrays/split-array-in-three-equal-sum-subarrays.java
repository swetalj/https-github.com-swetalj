// User function Template for Java
// import java.util.*;

class Solution {
    public List<Integer> findSplit(int[] arr) {
        long totalSum = 0;

        // Calculate total sum of the array
        for (int num : arr) {
            totalSum += num;
        }

        // If total sum is not divisible by 3, return {-1, -1}
        if (totalSum % 3 != 0) {
            return Arrays.asList(-1, -1);
        }

        long targetSum = totalSum / 3;
        long runningSum = 0;
        int firstSplit = -1, secondSplit = -1;

        // Traverse the array to find split indices
        for (int i = 0; i < arr.length; i++) {
            runningSum += arr[i];

            if (runningSum == targetSum && firstSplit == -1) {
                firstSplit = i; // First split found
            } else if (runningSum == 2 * targetSum && firstSplit != -1) {
                secondSplit = i; // Second split found
                break;
            }
        }

        // If both splits are found, return the indices
        return (firstSplit != -1 && secondSplit != -1) 
            ? Arrays.asList(firstSplit, secondSplit)
            : Arrays.asList(-1, -1);
    }
}