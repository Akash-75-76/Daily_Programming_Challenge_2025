public class Day3 {
    
    public static int findDuplicate(int[] nums) {
       
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 3, 4, 2, 2};
        int[] test2 = {3, 1, 3, 4, 2};
        int[] test3 = {1, 1};
        int[] test4 = {1, 4, 4, 2, 3};
        
        System.out.println(findDuplicate(test1)); 
        System.out.println(findDuplicate(test2)); 
        System.out.println(findDuplicate(test3)); 
        System.out.println(findDuplicate(test4)); 
    }
}
