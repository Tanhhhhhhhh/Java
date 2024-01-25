import java.util.Scanner;

public class PhuongTrinhBac1 {
    //ax+b=0
    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
double a,b;
System.out.println("nhap gia tri a");
a=sc.nextDouble();
System.out.println("nhap gia tri b");
b=sc.nextDouble();   
System.out.println("phuong trinh da nhap la" +a+"x+"+b);
if(a==0){
    if(b==0){
    System.out.println("phuong trinh vo so nghiem");}   
    else  {
    System.out.println("phuong trinh vo nghiem");}
        } else
    System.out.printf("ket qua cua phuong trinh la"+(-b/a));}
}