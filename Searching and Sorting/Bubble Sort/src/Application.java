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
        bubbleSort(arr, arrLength);
        System.out.println("The Elements After Sorting are: ");
        for (int i = 0; i < arrLength; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
    private static void bubbleSort(int[] arr, int arrLength) {
        for (int i = 0; i < arrLength - 1; i ++) {
            int count = 0;
            for (int j = 0; j < arrLength - 1; j ++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count ++;
                }
            }
            if (count == 0) {
                break;
            }
        }
    }
}
