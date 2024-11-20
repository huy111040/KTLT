import java.util.Scanner;

public class BT {
    public static void inTamGiacVuong(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuongNguoc(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuongSo(int n) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static void inTamGiacVuongNguocSo(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }

    public static void inKimTuThap(int n) {
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

    public static void inKimTuThapNguoc(int n) {
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

    public static void inKimTuThapSo(int n) {
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

    public static void inKimTuThapSoNguoc(int n) {
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
        System.out.printf("Nhập độ cao tam giác : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Nhập lựa chọn:");
        System.out.print("1. In tam giác vuông với ký tự *" +
                "\n2. In tam giác vuông ngược với ký tự *" +
                "\n3. In tam giác vuông với các số" +
                "\n4. In tam giác vuông ngược với các số" +
                "\n5. In kim tự tháp với ký tự * " +
                "\n6. In kim tự tháp ngược với ký tự * " +
                "\n7. In kim tự tháp với các số" +
                "\n8. In kim tự tháp ngược với ký tự *" +
                "\nLựa chọn của bạn là : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                inTamGiacVuong(n);
                break;
            case 2:
                inTamGiacVuongNguoc(n);
                break;
            case 3:
                inTamGiacVuongSo(n);
                break;
            case 4:
                inTamGiacVuongNguocSo(n);
                break;
            case 5:
                inKimTuThap(n);
                break;
            case 6:
                inKimTuThapNguoc(n);
                break;
            case 7:
                inKimTuThapSo(n);
                break;
            case 8:
                inKimTuThapSoNguoc(n);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

}
