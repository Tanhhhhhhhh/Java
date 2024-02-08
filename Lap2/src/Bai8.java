import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n;
        float tbc, sum=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap so phan tu cua mang");
            n= sc.nextInt();
        }
        while (n < 0);
        int A[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap so thu" +" " + (i+1)+": ");
            A[i] = sc.nextInt();
            sum += A[i];
        }
        tbc = sum / n;
        System.out.println("tbc =" + tbc );
        sc.close();
    }
}
