import java.util.Scanner;

public class Slide35Chuong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a va b : ");
        double a = sc.nextInt();
        double b = sc.nextInt();

        if(a > b) {
            System.out.println("b la so nho nhat");
        }
        else if(b > a) {
            System.out.println("a la so nho nhat");
        }
        else {
            System.out.println(" a va b bang nhau");
        }
    }
}
