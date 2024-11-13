package buoi4;

import java.util.Scanner;

public class Buoi4 {
    public static void bai4_1_nc() {
        int arr[] = { 3, 5, 8, 10, 14, 25 };

        String nguHanh[] = { "kim", "mộc", "thủy", "hỏa", "thổ" };

        int arr1[][] = new int[2][3];

        int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7 } };

        System.out.print("\nDanh sách phần tử của mảng arr là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\narr[%d] = %d", i, arr[i]);
        }

        System.out.print("\nDanh sách phần tử của mảng nguHanh là: ");
        for (int i = 0; i < nguHanh.length; i++) {
            System.out.printf("\nnguHanh[%d] = %s", i, nguHanh[i]);
        }
        System.out.println("\nDanh sách phần tử của mảng arr1 là: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("arr1[%d][%d]", i, j);
            }
            System.out.println();
        }
        System.out.println("\nDanh sách phần tử của mảng arr2 là: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("arr2[%d][%d] = %d\t", i, j, arr2[i][j]);
            }
            System.out.println();
        }

    }

    public static void bai4_6_nc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập số nguyên n: ");
        int n = sc.nextInt();

        System.out.printf("\nCác số chẵn nhỏ hơn " + n + " là:");
        for (int i = 2; i < n; i += 2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
     bai4_6_nc();
    }
}
