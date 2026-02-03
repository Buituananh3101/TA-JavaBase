package prj1.p24_DaHinh_;

public class Main {
    public static void main(String[] args) {
        
        Nguoi[] a = new Nguoi[5];
        a[0] = new SinhVien("a","b","c",0);
        a[1] = new NhanVien("a","b","c",1);
        a[2] = new NhanVien("a","b","c",2);
        a[3] = new SinhVien("a","b","c",3);
        a[4] = new SinhVien("a","b","c",4);
    
    //----- Kiểm tra kiểu Class

        for(Nguoi x: a) if(x instanceof SinhVien) System.out.println("OK");

        
    }
}
