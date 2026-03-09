package Assignments.Module6;

public class MajorityElement {

    public static int findMajority(int[] arr) {
        int candidate = 0;
        int count = 0;

        // Phase 1: Find Candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 2, 2, 2};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}