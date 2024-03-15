import java.util.Scanner;

public class Employee {
 Scanner sc = new Scanner(System.in);
 public String fullname ;
 String gioitinh ;
 int msv ;
 int soNgayLam ;
 final double Luong = 2000;
 public double Luongcuathang ;
 public void NhapHovaTen(){
    System.out.print("Nhap ho va ten cua sinh vien: ");
    fullname = sc.nextLine();
 }
 public void NhapGioiTinh(){
    System.out.print("Nhap gioi tinh: ");
    gioitinh = sc.nextLine();
 }
 public void NhapMaSV(){
    System.out.print("Nhap ma sinh vien: ");
    msv = sc.nextInt();
 }
 public void NhapSoNgayLam(){
    System.out.print("Nhap vao so ngay lam: ");
    soNgayLam = sc.nextInt();
 }
 public void LuongThang(){
    Luongcuathang = Luong*soNgayLam;
 }
 public void InLuong(){
    System.out.println("Luong cua nhan vien: "+ Luongcuathang);
 }
}
