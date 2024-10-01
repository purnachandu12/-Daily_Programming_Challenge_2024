import java.util.*;
public class MaxEveryWindow {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7};
        int k = 1;
        List<Integer> result = maxEveryWindow(arr, k);
        System.out.println(result);
    }

    public static List<Integer> maxEveryWindow(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i <= arr.length - k; i++) {
            int maxElement = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > maxElement) {
                    maxElement = arr[j];
                }
            }
            result.add(maxElement);
        }
        
        return result;
    }
}