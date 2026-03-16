package Assignments.Module8;
// LeetCode 191 – Number of 1 Bits
class NumberOfOneBits {

    public static int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1) {   // Check last bit
                count++;
            }
            n = n >>> 1;   // Unsigned right shift
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 11; // Binary: 1011
        System.out.println(hammingWeight(n)); // Output: 3
    }
}