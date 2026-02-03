package prj1.p24_DaHinh_;

public class NhanVien extends Nguoi {
    
//----- Thuộc tính

    private String ma;
    private double luong;
    
    public NhanVien(String ten, String ngaySinh, String ma, double luong) {
        super(ten, ngaySinh);
        this.ma = ma;
        this.luong = luong;
    }

    

    
}
