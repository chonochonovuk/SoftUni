import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String listOfInt = scanner.nextLine();
      int[] intArr = Arrays.stream(listOfInt.split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> lis = new ArrayList<>();
        lengthOfLIS(intArr,lis);

    }
    private static int lengthOfLIS(int[] nums,List<Integer> lisNumb) {
        if(nums==null || nums.length==0)
            return 0;

        int[] max = new int[nums.length];
        Arrays.fill(max, 1);
        int inres = 1;
        int result = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                    if (inres < max[j] + 1){
                        if (!lisNumb.contains(nums[j])) {
                            lisNumb.add(nums[j]);
                        }
                        if (!lisNumb.contains(nums[i])) {
                            lisNumb.add(nums[i]);
                        }
                    }
                    max[i]= Math.max(max[i], max[j]+1);
                    inres = Math.max(max[i], inres);
                }
            }
            result = Math.max(max[i], result);
        }

        return result;
    }
}
