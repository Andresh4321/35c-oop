package mockquestion;

import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        // question 9
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter five integer values:");
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxValue = max(arr);
        System.out.println("Maximum value: " + maxValue);
        int highestIndex = indexOfHighest(arr);
        System.out.println("Index of highest value: " + highestIndex);
        
        scanner.close();
    }
    public static int max(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
    public static int indexOfHighest(int[] arr) {
        int maxValue = max(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxValue) {
                return i;
            }
        }
        return -1; 
    }
}
