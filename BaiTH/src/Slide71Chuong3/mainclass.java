package Slide71Chuong3;

public class mainclass {
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
        ht.setBanKinh();
        float chuVi = ht.tinhChuVi();
        float dienTich = ht.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi);
        System.out.println("Dien tich hinh tron: " + dienTich);
    }
    
}

