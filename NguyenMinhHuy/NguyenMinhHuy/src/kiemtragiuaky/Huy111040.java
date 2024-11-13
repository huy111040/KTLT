package kiemtragiuaky;

public class Huy111040 {
    public static void cau2() {
        double a[][] = { { 5.5, 2.4, 3.8 }, { 6.5, 9.5 }, { 7.8, 8.0 } };
        System.out.println("\nDanh sách phần tử của mảng a là: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("a[%d][%d] = %.1f\t", i, j, a[i][j]);
            }
            System.out.println();
        }
    }

    public static void hienThiMang(int b[]) {
        System.out.println("\nCác phần tử của mảng b là: ");
        for (int i = 0; i < b.length; i++) {
            System.out.printf("\nb[%d] = %d", i, b[i]);
        }
    }

    public static int timMin(int b[]) {
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        System.out.printf("\nmin[%d]", min);
        return min;
    }

    public static int tinhTongLe(int b[]) {
        int tong = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 != 0) {
                tong = tong + b[i];
            }
        }
        System.out.printf("\ntong[%d]", tong);
        return tong;
    }

    public static void hienThiPhanTuMax10(int b[]) {
        System.out.print("\nCác phần tử nhỏ hơn hoặc bằng 10 trong mảng b là: ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] <= 10) {
                System.out.printf("\nb[%d] = %d", i, b[i]);
            }
        }
        System.out.println();
    }

    public static void hienThiPhanTuMin5(int b[]) {
        System.out.println("\nCác phần tử lớn hơn 5 trong mảng b là : ");
        for (int i = 0; i < b.length; i++) {
            if (b[i] > 5) {
                System.out.printf("\nb[%d] = %d", i, b[i]);
            }
        }
        System.out.println();
    }

    static int b[] = { 3, 5, 6, 8, 10, 14, 17, 19, 20 };

    public static void main(String[] args) {
        // cau2();
        // hienThiMang(b);
        // timMin(b);
        // tinhTongLe(b);
        // hienThiPhanTuMax10(b);
        hienThiPhanTuMin5(b);
    }
}
