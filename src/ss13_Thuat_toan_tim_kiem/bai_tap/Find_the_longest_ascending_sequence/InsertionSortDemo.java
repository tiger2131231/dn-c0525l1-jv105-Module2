package ss13_Thuat_toan_tim_kiem.bai_tap.Find_the_longest_ascending_sequence;

import java.util.Scanner;

public class InsertionSortDemo {

    public static void insertionSortWithSteps(int[] arr) {
        int n = arr.length;
        System.out.println("Mảng ban đầu:");
        printArray(arr);

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.print("Bước " + i + ": ");
            printArray(arr);
        }

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        System.out.println();
        insertionSortWithSteps(arr);
    }
}

