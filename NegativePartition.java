package Assignments.Module6;

public class NegativePartition {

    public static void partition(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] < 0) {
                left++;
            } 
            else if (arr[right] >= 0) {
                right--;
            } 
            else {
                // Swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {-1, 3, -2, 4, -5, 6};

        partition(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}