package nhanVienJava;

public class testNhanVien {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Thi Linh", 5);
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienFullTime linh2 = new NhanVienFullTime("Tran Van Linh");
        linh2.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        NhanVienPartTime thoivu = new NhanVienPartTime("Luu Van Vu", 300);
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoivu.tinhLuong();
     
        sep.xuatThongtin();
        linh1.xuatThongtin();
        linh2.xuatThongtin();
        thoivu.xuatThongtin();
    }
    
}
