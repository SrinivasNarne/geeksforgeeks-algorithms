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
        mergeSort(arr, 0, arrLength - 1);
        System.out.println("The Elements After Sorting are: ");
        for (int i = 0; i < arrLength; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
    private static void mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        } else {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] lArray = new int[mid - left + 1];
        int[] rArray = new int[right - (mid + 1) + 1];
        int l = 0;
        int m = 0;
        int n = left;
        for (int i = 0; i < lArray.length; i ++) {
            lArray[i] = arr[left + i];
        }
        for (int i = 0; i < rArray.length; i ++) {
            rArray[i] = arr[mid + 1 + i];
        }
        while ((l < lArray.length) && (m < rArray.length)) {
            if (lArray[l] < rArray[m]) {
                arr[n] = lArray[l];
                l ++;
                n ++;
            } else {
                arr[n] = rArray[m];
                m ++;
                n ++;
            }
        }
        while (l < lArray.length) {
            arr[n] = lArray[l];
            l ++;
            n ++;
        }
        while (m < rArray.length) {
            arr[n] = rArray[m];
            m ++;
            n ++;
        }
    }
}
