package Assignments.Module6;

public class MissingNumberXOR {

    public static int findMissing(int[] arr, int n) {

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        for (int num : arr) {
            xor2 ^= num;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};
        int n = 5;

        System.out.println("Missing Number: " + findMissing(arr, n));
    }
}