public class Day1 {

    public static void sortNums(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 1, 0, 2, 1, 0};
        int[] arr2 = {2, 2, 2, 2};
        int[] arr3 = {0, 0, 0, 0};
        int[] arr4 = {1, 1, 1, 1};
        int[] arr5 = {2, 0, 1};
        int[] arr6 = {};

        int[][] testCases = {arr1, arr2, arr3, arr4, arr5, arr6};

        for (int[] testCase : testCases) {
            sortNums(testCase);
            printArray(testCase);
        }
    }
}
