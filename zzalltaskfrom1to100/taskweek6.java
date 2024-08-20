package zzalltaskfrom1to100;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class taskweek6 {
   
    // One Dimensional Array Tasks

    // 1. Calculate the average value of array elements
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    // 2. Test if an array contains a specific value
    public static boolean containsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    // 3. Find the maximum and minimum value of an array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 4. Reverse the elements of a one-dimensional array
    public static void reverseArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    // Two Dimensional Array Tasks

    // 1. Add two 2x3 matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // 2. Print transpose of a 2x2 matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposed = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposed[i][j] = matrix[j][i];
            }
        }
        return transposed;
    }

    // 3. Print mirror of a 2x2 matrix
    public static int[][] mirrorMatrix(int[][] matrix) {
        int[][] mirrored = new int[2][2];
        for (int i = 0; i < 2; i++) {
            mirrored[i][0] = matrix[i][1];
            mirrored[i][1] = matrix[i][0];
        }
        return mirrored;
    }

    // 4. Multiply two 2x3 matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
        return result;
    }

    // ArrayList Tasks

    // 1. Create an ArrayList to hold string objects (car names)
    public static void arrayListExample() {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Audi");

        System.out.println("Cars in the ArrayList:");
        for (String car : cars) {
            System.out.println(car);
        }
    }

    // 2. Sort the integer elements of an array using ArrayList in ascending and descending order
    public static void sortArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(34, 67, 23, 89, 12, 3, 56, 78, 99, 14));

        Collections.sort(numbers);
        System.out.println("Ascending order: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + numbers);
    }

    // Additional Questions (Menu Driven Applications)

    // 1. Simple menu-driven application for array operations
    public static void menuDrivenArrayOperations() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int count = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add an element to the array");
            System.out.println("2. Display all elements of the array");
            System.out.println("3. Reverse the elements of the array");
            System.out.println("4. Find the largest element of the array");
            System.out.println("5. Find the smallest element of the array");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (count < array.length) {
                        System.out.print("Enter element: ");
                        array[count++] = scanner.nextInt();
                    } else {
                        System.out.println("Array is full.");
                    }
                    break;
                case 2:
                    System.out.println("Array elements: " + Arrays.toString(array));
                    break;
                case 3:
                    reverseArray(array);
                    System.out.println("Reversed array: " + Arrays.toString(array));
                    break;
                case 4:
                    System.out.println("Largest element: " + findMax(array));
                    break;
                case 5:
                    System.out.println("Smallest element: " + findMin(array));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // 2. Simple menu-driven student grading system
    public static void menuDrivenGradingSystem() {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[10];
        int count = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a grade to the system");
            System.out.println("2. Display all grades");
            System.out.println("3. Calculate the average grade");
            System.out.println("4. Find the highest grade");
            System.out.println("5. Find the lowest grade");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (count < grades.length) {
                        System.out.print("Enter grade: ");
                        grades[count++] = scanner.nextInt();
                    } else {
                        System.out.println("Grade array is full.");
                    }
                    break;
                case 2:
                    System.out.println("Grades: " + Arrays.toString(grades));
                    break;
                case 3:
                    System.out.println("Average grade: " + calculateAverage(grades));
                    break;
                case 4:
                    System.out.println("Highest grade: " + findMax(grades));
                    break;
                case 5:
                    System.out.println("Lowest grade: " + findMin(grades));
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        // Example usage of one-dimensional array tasks
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Average value: " + calculateAverage(array));
        System.out.println("Contains 30? " + containsValue(array, 30));
        System.out.println("Maximum value: " + findMax(array));
        System.out.println("Minimum value: " + findMin(array));
        reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(array));

        // Example usage of two-dimensional array tasks
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] result = addMatrices(matrix1, matrix2);
        System.out.println("Addition of two matrices: " + Arrays.deepToString(result));

        int[][] matrix3 = {{1, 2}, {3, 4}};
        int[][] transpose = transposeMatrix(matrix3);
        System.out.println("Transpose of matrix: " + Arrays.deepToString(transpose));

        int[][] mirrored = mirrorMatrix(matrix3);
        System.out.println("Mirrored matrix: " + Arrays.deepToString(mirrored));

        int[][] multiplicationResult = multiplyMatrices(matrix1, matrix2);
        System.out.println("Multiplication of two matrices: " + Arrays.deepToString(multiplicationResult));

        // Example usage of ArrayList tasks
        arrayListExample();
        sortArrayList();

        // Running menu-driven applications
        menuDrivenArrayOperations();
        menuDrivenGradingSystem();
    }
}

