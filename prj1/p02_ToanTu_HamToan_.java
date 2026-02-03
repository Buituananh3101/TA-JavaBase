package prj1;

public class p02_ToanTu_HamToan_ {

    //----- Ôn lại quy tắc ngầm

        // 1. char + int quy về ỉnt
        // 2. int + float = float
        // 3. int / int = int 
        // 4. (float)int / int = float
        // 5. 1L * int * int = long
        //    (long)int * int = long
    
    //----- Hàm toán 

       public static void main(String[] args) {
        
        System.out.println(Math.abs(-100));
        System.out.println(Math.max(0, 0));
        System.out.println(Math.min(0, 0));
        System.out.println((long)Math.sqrt(9));     
        System.out.println(Math.cbrt(27));        
        System.out.println(Math.pow(2,3));       
        System.out.println(Math.ceil(5.5));
        System.out.println(Math.floor(5.5));
        System.out.println(Math.round(5.5));

        /*
        100
        0
        0
        3    -> đúng ra sẽ là float nhưng bị ép về long
        3.0
        8.0
        6.0
        5.0
        6
        */

    //----- Lưu ý
        // Khi so sánh Double thì phải dùng hàm so sánh
        Double.compare(1.2, 1.4);
        // Các hàm so sánh có kiểu "a.cmp(b)" hoặc "DataType.cmp(a,b)"
        // Ta luôn hiểu là a<b thì biểu thức trả về -1, a=b thì 0, a>b thì 1.

       } 
}
