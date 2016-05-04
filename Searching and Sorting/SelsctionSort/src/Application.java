import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length of the Array: ");
        int arrLength = input.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i ++) {
            arr[i] = input.nextInt();
        }
        selectionSort(arr, arrLength);
        System.out.println("The Elements After Sorting are: ");
        for (int i = 0; i < arrLength; i ++) {
            System.out.print(arr[i] + " ");
        }
        input.close();
    }
    private static void selectionSort(int[] arr, int arrLength) {
        for (int i = 0; i < arrLength; i ++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < arrLength; j ++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = min;
                arr[minIndex] = temp;
            }
        }
    }
}
