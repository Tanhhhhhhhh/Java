package HinhHocs;

import java.util.Scanner;

public class HinhTru extends HinhTron  {
    public float chieucao;
   public HinhTru()
   {
        ten = "---Cylinder---";
   }
   public void nhapChieucao(){
        Scanner sc = new Scanner(System.in);
        super.nhapbanKinh();
        System.out.print("Nhap chieu cao: ");
        chieucao = sc.nextFloat();
   }
   void tinhthetich(){
        thetich = PI * banKinh * banKinh * chieucao;
   }  
}
