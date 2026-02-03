package prj1.p22_ClassSyntax_Get_Set_Constructor_toString_;

public class SanPham {
//----- Để prv để đảm bảo tính đóng gói -> đảm bảo tính bảo mật 

    private String tenSanPham;
    private String maSanPham;
    private double giaBan;

//----- Constructor

    // Thói quen tốt là luôn gán một giá trị trước
    public SanPham(String tenSanPham, String maSanPham, double giaBan) {
        this.tenSanPham = tenSanPham;
        this.maSanPham = maSanPham;
        this.giaBan = giaBan;
    }

//----- Không có hàm hủy vì có trình tự dọn rác

//----- Tự sinh code get set: chuột phải chọn "Source action"

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

//----- Ghi đè toString, sopr mà ko cần hàm hienThiThongTin
    @Override
    public String toString() {
        return "SanPham [tenSanPham=" + tenSanPham + ", maSanPham=" + maSanPham + ", giaBan=" + giaBan + "]";
    }

    public void hienThiThongTin(){
        System.out.println(tenSanPham+" "+maSanPham+" "+giaBan);
    }

}
