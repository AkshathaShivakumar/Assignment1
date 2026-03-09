package Assignments.Module6;

public class DifferenceArray {

    public static void main(String[] args) {

        int n = 5;
        int[] diff = new int[n];

        // Update 1: (1,3,5)
        update(diff, 1, 3, 5);

        // Update 2: (2,4,2)
        update(diff, 2, 4, 2);

        // Build final array using prefix sum
        int[] result = new int[n];
        result[0] = diff[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        // Print final array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void update(int[] diff, int L, int R, int val) {
        diff[L] += val;
        if (R + 1 < diff.length) {
            diff[R + 1] -= val;
        }
    }
}