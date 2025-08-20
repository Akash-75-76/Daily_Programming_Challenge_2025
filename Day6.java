import java.util.*;

public class Day6 {
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        int n = arr.length;
        int prefixSum = 0;

      
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            if (map.containsKey(prefixSum)) {
                for (int startIndex : map.get(prefixSum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            map.computeIfAbsent(prefixSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, -3, 3, -1, 2};
        List<int[]> res1 = findZeroSumSubarrays(arr1);
        for (int[] sub : res1) {
            System.out.println("(" + sub[0] + ", " + sub[1] + ")");
        }

        int[] arr2 = {0, 0, 0};
        List<int[]> res2 = findZeroSumSubarrays(arr2);
        for (int[] sub : res2) {
            System.out.println("(" + sub[0] + ", " + sub[1] + ")");
        }
    }
}
