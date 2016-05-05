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
        heapSort(arr, arrLength);
        System.out.println("The Elements After Sorting are: ");
        for (int i = 0; i < arrLength; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
    private static void heapSort(int[] arr, int arrLength) {
        for (int i = (arrLength/2) - 1; i >= 0; i --) {
            heapify(arr, arrLength, i);
        }
        for (int i = arrLength - 1; i >= 0 ; i --) {
            int swap = arr[0];
            arr[0] = arr[i];
            arr[i] = swap;
            heapify(arr, i, 0);
        }
    }
    private static void heapify(int[] arr, int arrLength, int i) {
        int maxIndex = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;
        if ((leftIndex < arrLength) && (arr[leftIndex] > arr[maxIndex])) {
            maxIndex = leftIndex;
        }
        if ((rightIndex < arrLength) && (arr[rightIndex] > arr[maxIndex])) {
            maxIndex = rightIndex;
        }
        if (maxIndex != i) {
            int swap = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = swap;
            heapify(arr, arrLength, maxIndex);
        }
    }
}
