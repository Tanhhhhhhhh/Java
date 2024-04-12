package nhanVienJava;

import java.util.Scanner;

public class nhanvien {
    Scanner sc = new Scanner(System.in);
    protected String FullName;
    protected long Luong;
    protected String NhanVien;
    public nhanvien()  {
FullName=" ";
Luong =0;
    }
   public nhanvien(String FullName){
    this.FullName = FullName;
   }
   protected String NhanVien(){
    return " ";
   }
   public void xuatThongtin(){
    System.out.println("Ten Nhan Vien:" + FullName);
    System.out.println("Loai Nhan Vien:" + NhanVien);
    System.out.println("Luong ="+ Luong + "VND");
   }
}
