import java.util.Scanner;

public class Slide74Chuong2 {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so phan tu cua mang:");
            n = sc.nextInt();
        }
        while (n < 0);
        int A [] = new int [n];
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n;i++){
            System.out.println("Nhap phan tu thu " +i + ": ");
        A [i] = sc.nextInt();
        }
        // Tinh tong cac so chan trong mang 
        double Torng = 0;
        for ( int i = 0; i < n;i++) 
            if (A[i] % 2 == 0) {
                Torng +=A[i];
            }
            System.out.println("Tong:" + Torng);
        }
    }