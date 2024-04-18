package nhanVienJava;

public class NhanVienPartTime extends nhanvien {
    private int gioLamViec;
    public NhanVienPartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String NhanVien() {
        return "Nhan vien thoi vu";
    }
    public void tinhLuong() {
        Luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }

    
}
