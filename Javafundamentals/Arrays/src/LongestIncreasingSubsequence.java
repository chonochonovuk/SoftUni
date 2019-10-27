import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    private static void lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int max = -1;
            // Check If Previous Element > Current Element
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]){
                    // Update The Max From The Previous Entries
                    if (max == -1 || max < LIS[j] + 1){
                        max = 1 + LIS[j];
                    }
                }
            }

            if (max == -1){
                // None of The Previous Element has < nums[j]
                max = 1;
            }
            LIS[i] = max;
        }

        // find the max in the LIS[]
        int result = -1;
        int index = -1;
        for (int i = 0; i < LIS.length; i++) {
            if (result < LIS[i]){
                result = LIS[i];
                index = i;
            }
        }
        // print the result
        //Start moving backwards from the end and
        String path = nums[index] + " ";
        int res = result - 1;
        for (int i = index - 1; i >= 0 ; i--) {
            if (LIS[i] == res){
                path = nums[i] + " " + path;
                res--;
            }
        }
        System.out.println("Longest Increasing Subsequence: " + result);
        System.out.println("Actual Elements: " + path);
    }

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String listOfInt = scanner.nextLine();
      int[] intArr = Arrays.stream(listOfInt.split(" ")).mapToInt(Integer::parseInt).toArray();
        LongestIncreasingSubsequence i = new LongestIncreasingSubsequence();
        i.lengthOfLIS(intArr);


    }

}
