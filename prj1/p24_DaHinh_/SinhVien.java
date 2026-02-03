package prj1.p24_DaHinh_;

public class SinhVien extends Nguoi{
    
//----- Thuộc tính

    private String ma;
    private double gpa;
    
    public SinhVien(String ten, String ngaySinh, String ma, double gpa) {
        super(ten, ngaySinh);
        this.ma = ma;
        this.gpa = gpa;
    }

    

}
