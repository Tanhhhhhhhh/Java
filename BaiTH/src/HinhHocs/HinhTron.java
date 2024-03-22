package HinhHocs;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
public float banKinh;
public HinhTron()
{
    ten = "---Circle---"; 
}    
public void nhapbanKinh(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ban kinh: ");
    banKinh = sc.nextFloat();
}
public void tinhchuvi() {
    chuvi = 2*PI*banKinh;
}
public void tinhdientich(){
    dientich = PI*banKinh*banKinh;
 }
}
