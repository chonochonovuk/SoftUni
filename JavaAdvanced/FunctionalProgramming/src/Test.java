import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {2,5,8,10};
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\]]",""));
    }
}
