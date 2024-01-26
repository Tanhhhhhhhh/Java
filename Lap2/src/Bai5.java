import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tong = 0;

        while (tong <= 100) {
            System.out.print("Nhap gia tri n: ");
            int n = sc.nextInt();
            tong += n;
            System.out.println("Tong cac so da nhap la: " + tong);
        }
            System.out.println("Tong cac so da nhap sau vong lap la: "+ tong);
    }
}