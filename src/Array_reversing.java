public class Array_reversing {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] rev = new int[nums.length];
        reverse(nums, rev);
    }
    public static int[] reverse(int[] nums, int[] rev){
        for(int i = 0; i < nums.length; i++){
            rev[i] = nums[nums.length - 1 - i];
            System.out.println(rev[i]);
        }
        return rev;
    }
}
