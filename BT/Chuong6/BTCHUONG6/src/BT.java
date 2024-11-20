import java.util.Scanner;

public class BT {
    public static void inTamGiacVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao tam giác vuông");
        int n = sc.nextInt();
        for (int i = 0; i<= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuongNguoc() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao tam giác vuông Ngược ");
        int n = sc.nextInt();
        for (int i = n; i> 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuongSo() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao tam giác vuông bằng số ");
        int n = sc.nextInt();
        for (int i = 0; i< n+1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuongNguocSo() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao tam giác vuông Ngược bằng số ");
        int n = sc.nextInt();
        for (int i = n; i> 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static void inKimTuThap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao kim tự tháp ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void inKimTuThapNguoc(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao kim tự tháp ngược ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void inKimTuThapSo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao kim tự tháp ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "  ");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + "  "); 
            }
            System.out.println();
        }

    }

    public static void inKimTuThapSoNguoc(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập độ cao kim tự tháp ngược ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + "  ");
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + "  "); 
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
       inKimTuThapSoNguoc();
    }

}
