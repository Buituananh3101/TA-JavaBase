package prj1.p23_KeThua_;

public class Nguoi {

//----- Thuộc tính

    private String ten, ngaySinh;

//---- Tạo ko đối

    public Nguoi(){
        System.out.println("Tao ngươi");
        ten = "Bui Tuan Anh";
        ngaySinh = "00/00/0000";
    }

//----- Tạo có đối

    public Nguoi(String ten, String ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

//----- toString

    @Override
    public String toString() {
        return  ten +" "+ ngaySinh ;
    }

//----- Phương thức

    public void hienThi(){
        System.out.println(ten+" "+ngaySinh);
    }

    
}
