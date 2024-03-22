package HinhHocs;
public class TestBai {
    public static void main(String[] args) {
        
        HinhTron ht = new HinhTron();
        ht.XuatTen();
        ht.nhapbanKinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
        HinhTru htru = new HinhTru();
        htru.XuatTen();
        htru.nhapChieucao();
        htru.tinhthetich();
        htru.inthetich();
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.XuatTen();
        hcn.nhapChieudai();
        hcn.nhapChieurong();
        hcn.tinhChuvi();
        hcn.tinhDientich();
        hcn.inchuvi();
        hcn.indientich();

        HinhVuong hv = new HinhVuong();
        hv.XuatTen();
        hv.nhapCanh();
        hv.tinhChuvi();
        hv.tinhDientich();
        hv.inchuvi();
        hv.indientich();
    }
}
