package buoi7;

import java.util.Scanner;

public class Buoi7 {
    public static float nhapDiem() {
        Scanner sc = new Scanner(System.in);
        float diem = 0;
        while (true) {
            try {
                System.out.print("Nhập điểm từ bàn phím");
                diem = Float.parseFloat(sc.nextLine());
                if (diem >= 0 && diem <= 10) {
                    break;
                } else {
                    System.out.print("Điểm ko hợp lệ");
                }
            } catch (Exception e) {
                System.out.println("Điểm ko hợp lệ");
            }
        }
        return diem;
    }

    public static int nhapTuoi() {
        Scanner sc = new Scanner(System.in);
        int tuoi = 0;
        while (true) {
            try {
                System.out.print(" Nhập số tuổi ");
                tuoi = Integer.parseInt(sc.nextLine());
                if (tuoi >= 0 && tuoi <= 150) {
                    break;
                } else {
                    System.out.println("Tuổi ko hợp lệ nằm trong khoảng 0-150");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Tuổi ko hợp lệ ");
            }
        }
        return tuoi;
    }

    public static void main(String[] args) {
        // nhapDiem();
        nhapTuoi();
    }
}
