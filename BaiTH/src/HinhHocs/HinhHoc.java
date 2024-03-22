package HinhHocs;

public class HinhHoc {
    final float PI = 3.14f;
    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;

     public HinhHoc()
     {
        ten =" ";
        chuvi = 0;
        dientich = 0;
        thetich = 0;
     }
     public void XuatTen() {
        System.out.println(ten);
     }
     public void inchuvi(){
        System.out.println("Chu vi: " + chuvi);
     }
     public void indientich(){
        System.out.println("Dien tich: " + dientich);
     }
     public void inthetich(){
        System.out.println("The tich: " + thetich);
     }
}
