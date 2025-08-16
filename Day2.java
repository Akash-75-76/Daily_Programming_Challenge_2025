public class Day2 {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; 
        long totalSum = (long) n * (n + 1) / 2;  
        long arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return (int) (totalSum - arrSum);
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 4, 5};
        System.out.println("Missing number: " + findMissingNumber(arr1)); // 3

        int[] arr2 = {2, 3, 4, 5};
        System.out.println("Missing number: " + findMissingNumber(arr2)); // 1

        int[] arr3 = {1, 2, 3, 4};
        System.out.println("Missing number: " + findMissingNumber(arr3)); // 5

        int[] arr4 = {1};
        System.out.println("Missing number: " + findMissingNumber(arr4)); // 2

        
        int n = 1000000;
        int[] arr5 = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            arr5[i] = i + 1; 
        }
        System.out.println("Missing number: " + findMissingNumber(arr5)); 
    }
}
