// Count Elements With Maximum Frequency

// Hint
// You are given an array nums consisting of positive integers.
// Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
// The frequency of an element is the number of occurrences of that element in the array.

// Example 1:

// Input: nums = [1,2,2,3,1,4]
// Output: 4
// Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
// So the number of elements in the array with maximum frequency is 4.

import java.util.ArrayList;

public class CountMaxFreqElements {
    public int maxFrequencyElements(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int max_freq = 1;
        for (int i = 0; i < nums.length; i++) {
            int freq = 1;
            for (int k = 0; k < nums.length; k++) {
                if (nums[i] == nums[k]) {
                    freq++;
                }
            }

            if (freq == max_freq) {
                arr.add(nums[i]);
            }

            if (freq > max_freq) {
                max_freq = freq;
                arr.clear();
                arr.add(nums[i]);
            }
        }

        return arr.size();
    }

    public static void main(String[] args) {
        CountMaxFreqElements sol = new CountMaxFreqElements();

        int[] nums1 = { 1, 2, 2, 3, 1, 4 };
        System.out.println("Output 1: " + sol.maxFrequencyElements(nums1)); // Expected 4

        int[] nums2 = { 1, 2, 3, 4, 5 };
        System.out.println("Output 2: " + sol.maxFrequencyElements(nums2)); // Expected 5
    }
}
