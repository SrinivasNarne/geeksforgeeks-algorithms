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
        insertionSort(arr, arrLength);
        System.out.println("The Elements After Sorting are: ");
        for (int i = 0; i < arrLength; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
    private static void insertionSort(int[] arr, int arrLength) {
        for (int i = 1; i < arrLength; i ++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j --) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else break;
            }
        }
    }
}
