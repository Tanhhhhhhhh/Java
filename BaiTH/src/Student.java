import java.util.Scanner;
    public class Student {
        Scanner sc = new Scanner(System.in);
        String hoten, diachi;
        int namsinh;
        double diemtoan, diemvan, diemanh, dtb;
        public void nhapthongtin()
{
    System.out.println("Nhap thong tin hoc sinh:");
    System.out.print("Ho va ten:");
    hoten = sc.nextLine();
    System.out.print("Dia chi:");
    diachi = sc.nextLine();
    System.out.print("Nam sinh:");
    namsinh = sc.nextInt();
    System.out.print("Diem toan:");
    diemtoan = sc.nextDouble();
    System.out.print("Diem van:");
    diemvan = sc.nextDouble();
    System.out.print("Diem anh:");
    diemanh = sc.nextDouble();
}
public void tinhdiemtrungbinh()
{
    dtb =(diemtoan+diemanh+diemvan)/3;
}
public void xuatThongTin()
{
    System.out.println("Thong tin cua hoc sinh:");
    System.out.println("Nhap ho ten cua hoc sinh: "+hoten);
    System.out.println("Nhap dia chi cua hoc sinh: "+diachi);
    System.out.println("Nhap nam sinh cua hoc sinh: "+namsinh);
    System.out.println("Nhap diem tong ket trung binh: "+dtb);
}
    }
