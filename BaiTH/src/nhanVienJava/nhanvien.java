package nhanVienJava;

import java.util.Scanner;

public class nhanvien {
    Scanner sc = new Scanner(System.in);
    protected String ten;
    protected long Luong;
    protected String NhanVien;
    public nhanvien()  {
ten=" ";
Luong =0;
    }
   public nhanvien(String ten){
    this.ten = ten;
   }
   protected String NhanVien(){
    return " ";
   }
   public void xuatThongtin(){
    System.out.println("Ten Nhan Vien:" + ten);
    System.out.println("Loai Nhan Vien:" + NhanVien);
    System.out.println("Luong ="+ Luong + "VND");
   }
}
