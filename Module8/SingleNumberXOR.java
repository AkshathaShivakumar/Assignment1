package Assignments.Module8;

// LeetCode 136 – Single Number using XOR
class SingleNumberXOR {

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result = result ^ num;   // XOR operation
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 2, 1};
        System.out.println(singleNumber(nums1)); // 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums2)); // 4
    }
}