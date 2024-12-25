import java.util.Arrays;
import java.util.Scanner;

public class BTPhan2 {
    public static boolean kiemTraSoNgTo(int n) {
        boolean snt = true;
        if (n == 0 || n == 1) {
            return false;
        }
        int i = 2, tam = (int) Math.sqrt(n);
        while (i <= tam) {
            if (n % i == 0) {
                snt = false;
                break;
            }
            i++;
        }
        return snt;
    }

    public static void bai19(int n) {
        for (int i = 0; i < n; i++) {
            if (kiemTraSoNgTo(i) == true) {
                System.out.println(i + "\t");
            }
        }
    }

    public static void bai20() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Đây là ba cạnh của một tam giác.");

            if (a == b && b == c) {
                System.out.println("Tam giác đều.");
            } else if (a == b || b == c || a == c) {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("Tam giác vuông cân.");
                } else {
                    System.out.println("Tam giác cân.");
                }
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println(a + "và" + b + "và" + c + "Tam giác vuông.");
            } else {
                System.out.println("Tam giác thường.");
            }
        } else {
            System.out.println("Ba số không phải là cạnh của một tam giác.");
        }
    }

    public static long giaiThua(int n) {
        int kq = 1;
        for (int i = 1; i <= n; i++) {
            kq *= i;
        }
        return kq;

    }

    public static void bai6() {
        long s = giaiThua(4) + giaiThua(5) + giaiThua(7) + giaiThua(9);
        System.out.println("S = " + s);
    }

    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 2; i <= n; i += 2) {
            tong += i;
        }
        System.out.println("tổng các số chẵn là : " + tong);
    }

    public static void bai14() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập số a ");
        int a = scanner.nextInt();
        System.out.printf("Nhập số b ");
        int b = scanner.nextInt();
        System.out.printf("Nhập số c ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        scanner.close();
        System.out.println("Giá trị lớn nhất : " + max);
    }

    public static boolean kiemTraSoHoanHao(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void bai27() {

    }

    public static void kiemTraDoiXung(int a) {
        int goc = a, tong = 0;
        while (a != 0) {
            int tam = a % 10;
            tong = tong * 10 + tam;
            a /= 10;
        }

        if (tong == goc) {
            System.out.println("Day la so doi xung");
        } else {
            System.out.println("Day khong phai so doi xung");
        }
    }

    public static void hienThiSoDaoNguoc(int a) {
        int goc = a, tong = 0;
        while (a != 0) {
            int tam = a % 10;
            tong = tong * 10 + tam;
            a /= 10;
        }
        System.out.println("Số " + goc + " khi đảo ngược là: " + tong);
    }

    // hãy viết chương trình nhập từ bàn phím các phần tử mảng A kích thước n với 0
    // < n < 15 và hiển thị mảng vừa nhập
    public static void hThiMang() {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập kích thước mảng (0 < n < 15): ");
            n = scanner.nextInt();
        } while (n <= 0 || n >= 15);

        int[] A = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }

        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }

        scanner.close();
    }

    public static void bai28() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Tách các từ trong chuỗi dựa trên khoảng trắng
        String[] words = input.split("\\s+");

        // Tìm từ dài nhất và vị trí của nó
        String longestWord = "";
        int longestWordIndex = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
                longestWordIndex = i;
            }
        }

        // Hiển thị kết quả
        if (!longestWord.isEmpty()) {
            System.out.println("Từ dài nhất: " + longestWord);
            System.out.println("Vị trí: " + (longestWordIndex + 1)); // Vị trí tính từ 1
        } else {
            System.out.println("Không tìm thấy từ nào trong chuỗi.");
        }

        scanner.close();
    }

    public static void bai29() {
        Scanner scanner = new Scanner(System.in);// Nhập chuỗi từ người dùng
        System.out.print("Nhập họ tên (dạng: họ... tên đệm... tên...): ");
        String fullName = scanner.nextLine().trim();
        String[] nameParts = fullName.split(" ");// Tách các phần của tên dựa trên dấu cách

        if (nameParts.length < 2) {
            System.out.println("Vui lòng nhập đầy đủ họ, tên đệm và tên.");
        } else {
            String ten = nameParts[nameParts.length - 1];
            String ho = nameParts[0];
            StringBuilder tenDem = new StringBuilder();

            for (int i = 1; i < nameParts.length - 1; i++) {
                tenDem.append(nameParts[i]).append(" ");
            }

            // Loại bỏ khoảng trắng dư thừa ở cuối tên đệm
            String middleNameTrimmed = tenDem.toString().trim();

            // Hiển thị tên theo định dạng mới
            System.out.println("Tên đã chuyển đổi: " + ten + " " + ho + " " + middleNameTrimmed);
            System.out.println(ho);
        }

        scanner.close();
    }

    public static void bai31() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // Chuẩn hóa chuỗi (bỏ khoảng trắng và không phân biệt chữ hoa chữ thường)
        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

        // Kiểm tra Palindrome
        boolean isPalindrome = true;
        int length = normalizedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalizedInput.charAt(i) != normalizedInput.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Hiển thị kết quả
        if (isPalindrome) {
            System.out.println("Chuỗi đã nhập là Palindrome.");
        } else {
            System.out.println("Chuỗi đã nhập không phải là Palindrome.");
        }

        scanner.close();

    }

    public static void bai32() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine().trim();

        // Tách các từ trong chuỗi dựa trên khoảng trắng
        String[] words = input.split("\\s+");

        // Đếm số từ
        int wordCount = (input.isEmpty()) ? 0 : words.length;

        // Hiển thị kết quả
        System.out.println("Số từ trong chuỗi: " + wordCount);

        scanner.close();
    }

    public static void bai33(){
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // a. Đếm số lượng từ 'Java' có trong chuỗi
        int javaCount = input.split("\\bJava\\b", -1).length - 1;
        System.out.println("Số lượng từ 'Java' có trong chuỗi: " + javaCount);

        // b. Lấy vị trí của từ 'Java' cuối cùng có trong chuỗi
        int lastJavaIndex = input.lastIndexOf("Java");
        if (lastJavaIndex != -1) {
            System.out.println("Vị trí của từ 'Java' cuối cùng trong chuỗi: " + lastJavaIndex);
        } else {
            System.out.println("Không tìm thấy từ 'Java' trong chuỗi.");
        }

        // c. Thay thế từ 'Java' bằng từ 'java' trong chuỗi
        String replacedString = input.replace("Java", "java");
        System.out.println("Chuỗi sau khi thay thế: " + replacedString);

        // d. Đếm số lượng ký tự là số có trong chuỗi
        int digitCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        System.out.println("Số lượng ký tự là số trong chuỗi: " + digitCount);

        scanner.close();
    }
    public static void bai34(){
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ người dùng
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        // a. Đếm số lượng ký tự 'a' có trong chuỗi
        int aCount = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                aCount++;
            }
        }
        System.out.println("Số lượng ký tự 'a' có trong chuỗi: " + aCount);

        // b. Kiểm tra chuỗi có chứa từ 'Java'
        if (input.contains("Java")) {
            System.out.println("Chuỗi có chứa từ 'Java'.");
        } else {
            System.out.println("Chuỗi không chứa từ 'Java'.");
        }

        // c. Kiểm tra chuỗi có bắt đầu bằng từ 'Write'
        if (input.startsWith("Write")) {
            System.out.println("Chuỗi bắt đầu bằng từ 'Write'.");
        } else {
            System.out.println("Chuỗi không bắt đầu bằng từ 'Write'.");
        }

        // d. Kiểm tra chuỗi có kết thúc bằng từ 'easily'
        if (input.endsWith("easily")) {
            System.out.println("Chuỗi kết thúc bằng từ 'easily'.");
        } else {
            System.out.println("Chuỗi không kết thúc bằng từ 'easily'.");
        }

        scanner.close();
    }
    public static void bai35(){
        Scanner scanner = new Scanner(System.in);

        // Nhập số dòng và cột của ma trận
        System.out.print("Nhập số dòng của ma trận: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        // Nhập các phần tử của ma trận
        System.out.println("Nhập các phần tử của ma trận (các số nguyên từ 1 đến 99):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] <= 0 || matrix[i][j] >= 100) {
                    System.out.println("Phần tử không hợp lệ. Vui lòng nhập lại.");
                    j--;
                }
            }
        }

        // a. Tìm phần tử lớn nhất cùng với chỉ số
        int max = matrix[0][0];
        int maxRow = 0, maxCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Phần tử lớn nhất: " + max + " tại vị trí (" + maxRow + ", " + maxCol + ")");

        // b. Tìm và in ra các phần tử là số đối xứng (Palindrome)
        System.out.print("Các phần tử là số đối xứng: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isPalindrome(matrix[i][j])) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();

        // c. Tìm và in ra các phần tử là số nguyên tố (các phần tử không phải số nguyên tố được thay bằng 0)
        System.out.println("Ma trận sau khi thay các số không phải nguyên tố bằng 0:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isPrime(matrix[i][j])) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // d. Sắp xếp tất cả các cột theo thứ tự tăng dần
        for (int j = 0; j < m; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = matrix[i][j];
            }
            Arrays.sort(column);
            for (int i = 0; i < n; i++) {
                matrix[i][j] = column[i];
            }
        }

        System.out.println("Ma trận sau khi sắp xếp các cột tăng dần:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
    private static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Hàm kiểm tra số nguyên tố
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void bai36(){
        Scanner scanner = new Scanner(System.in);

        // a. Liệt kê các số nguyên tố có từ 5 đến 7 chữ số
        System.out.println("Các số nguyên tố có từ 5 đến 7 chữ số:");
        for (int i = 10000; i <= 9999999; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // b. Liệt kê các số đối xứng (Palindrome) có từ 5 đến 7 chữ số
        System.out.println("Các số đối xứng (Palindrome) có từ 5 đến 7 chữ số:");
        for (int i = 10000; i <= 9999999; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
    public static void bai37(){
        Scanner scanner = new Scanner(System.in);

        // a. Liệt kê các số có 7 chữ số mà tổng các chữ số là số đối xứng (Palindrome)
        System.out.println("Các số có 7 chữ số mà tổng các chữ số là số đối xứng:");
        for (int i = 1000000; i <= 9999999; i++) {
            if (isPalindrome(sumOfDigits(i))) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // b. Liệt kê các số có 7 chữ số mà mỗi chữ số đều là số nguyên tố
        System.out.println("Các số có 7 chữ số mà mỗi chữ số đều là số nguyên tố:");
        for (int i = 1000000; i <= 9999999; i++) {
            if (allDigitsArePrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
    // Hàm tính tổng các chữ số của một số
    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    // Hàm kiểm tra tất cả các chữ số của số đều là số nguyên tố
    private static boolean allDigitsArePrime(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (!isPrime(digit)) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
    public static void bai38(){
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng (các số nguyên từ 1 đến 99):");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
            if (A[i] <= 0 || A[i] >= 100) {
                System.out.println("Phần tử không hợp lệ. Vui lòng nhập lại.");
                i--;
            }
        }

        // a. Tìm phần tử lớn thứ 2 cùng với chỉ số
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMaxIndex = -1;
        for (int i = 0; i < n; i++) {
            if (A[i] > firstMax) {
                secondMax = firstMax;
                secondMaxIndex = i;
                firstMax = A[i];
            } else if (A[i] > secondMax && A[i] < firstMax) {
                secondMax = A[i];
                secondMaxIndex = i;
            }
        }
        if (secondMaxIndex != -1) {
            System.out.println("Phần tử lớn thứ 2: " + secondMax + " tại vị trí " + secondMaxIndex);
        } else {
            System.out.println("Không có phần tử lớn thứ 2.");
        }

        // b. Sắp xếp mảng theo thứ tự giảm dần
        Arrays.sort(A);
        System.out.println("Mảng sau khi sắp xếp giảm dần:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        // c. Nhập số nguyên x và chèn x vào mảng sao cho vẫn đảm bảo thứ tự giảm dần
        System.out.print("Nhập số nguyên x để chèn vào mảng: ");
        int x = scanner.nextInt();
        int[] newArray = new int[n + 1];
        boolean inserted = false;
        for (int i = 0, j = 0; i < n; i++, j++) {
            if (!inserted && x > A[n - 1 - i]) {
                newArray[j] = x;
                inserted = true;
                j++;
            }
            newArray[j] = A[n - 1 - i];
        }
        if (!inserted) {
            newArray[n] = x;
        }

        System.out.println("Mảng sau khi chèn x và sắp xếp giảm dần:");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }

    public static int[] nhapMang(){
        int n;
        while (true) {
            try {
                System.out.println("\nhap kich thuoc mang: ");
                n=Integer.parseInt(sc.ne)
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
            return null;
        
    }
    public static void main(String[] args) {
        bai31();
    }
}
