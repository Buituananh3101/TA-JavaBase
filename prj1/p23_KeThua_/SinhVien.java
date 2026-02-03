package prj1.p23_KeThua_;

public class SinhVien extends Nguoi{

//----- Thuộc tính

    private String ma;
    private double gpa;

//---- Tạo ko đối

    public SinhVien(){
        System.out.println("Tao sinh viên");
        ma = "bta";
        gpa = 4;
    }

//----- Tạo có đối x kế thừa hàm tạo
    
    // Phải tạo hàm có đối ở lớp cha trước thì mới dùng được tự động sinh code

    public SinhVien(String ten, String ngaySinh, String ma, double gpa) {
        super(ten, ngaySinh); // Phải được viết trước
        this.ma = ma;
        this.gpa = gpa;
    }

//----- toString x kế thừa

    public String toString(){
        return super.toString() +" "+ ma +" "+ gpa;
    }

//----- Phương thức x kế thừa từ cha

    @Override // Có hay ko cx được
    public void hienThi(){
        super.hienThi();
        System.out.println(ma+" "+gpa);
    }
}
