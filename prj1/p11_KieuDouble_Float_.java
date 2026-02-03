package prj1;

public class p11_KieuDouble_Float_ {
    public static void main(String[] args) {
        
        // Muốn so sánh 2 số double phải dùng hàm
        double x = 1.4, y=1.2;
        
        if( Double.compare(x, y) == 1) System.out.println("Yes");
        // x < y --> -1
        // x = y --> 0
        // x > y --> 1


    }
}
