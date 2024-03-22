package HinhHocs;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai;
    public float rong;
    Scanner sc = new Scanner(System.in);
    public HinhChuNhat()
    {
        ten = "---Rectangle---";
    }
    public void nhapChieudai(){ 
        System.out.print("Nhap chieu dai: " );
        dai = sc.nextFloat();
    }
    public void nhapChieurong(){
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }
    public void tinhChuvi(){
         chuvi = (dai+rong)*2;
    }
    public void tinhDientich(){
        dientich = dai*rong;
    }



}
