package prj1;

import java.util.ArrayList;
import java.util.Scanner;

public class p07_ArrayList_ {
    public static void main(String[] args) {
        
    //----- Khai báo ArrayList

        ArrayList<Integer> a = new ArrayList<>(); // Integer trong <> gọi là wrapper

    //----- Khai báo 1 mảng 10 phần tử ArrayList, cái này cho vui thôi

        ArrayList<Integer>[] aa = new ArrayList[10]; 
        aa[0] = new ArrayList<>(); // Nhớ cấp phát cho từng phần tử
        
    //----- Các hàm ArrayList: có : 1 100 2 3 2 2 3 

        a.add(1); 
        a.add(2); 
        a.add(3); 
        a.add(2); 
        a.add(2); 
        a.add(3); 
        a.add(1,100); // chèn

        // a.remove((Object)2);  // Xóa giá trị 2          --> 1 100 x 3 2 2 3 
        // a.remove(5);          // xóa số ở vị trí 5      --> 1 100 2 3 2 x 3
        // a.contains(2);        // Tìm kiếm tuyến tính    --> true

        // a.clear();
        // a.isEmpty();

        // a.indexOf(2)          // vị trí số 2 đầu tiên   --> 2
        // a.lastIndexOf(2)      // vị trí số 2 cuối cùng  --> 5

        // a.set(0,100)          // = "a[0]=100"
        
        int n = a.size();

    //----- Duyệt ArrayList

        for(int i=0;i<n;i++) System.out.println(a.get(i)+ " "); // "[i]" = ".get(i)"

        for(int x: a) System.out.printf("%d ",x); // = forx
        
        System.out.println();

        a.forEach(x->System.out.print(x + " "));// forx tích hợp (chỉ dùng cho mảng động)

        
    //----- Nhập ArrayList
    
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<m;i++) b.add(sc.nextInt());
        for(int x : b) System.out.print(x + " ");


        sc.close();
    }
    // Tất cả các hàm
    // public static void main(String[] args) {
    //     // 1. Khởi tạo danh sách
    //     ArrayList<String> list = new ArrayList<>();

    //     // --- NHÓM THÊM PHẦN TỬ ---
    //     list.add("Java");               // Thêm phần tử vào cuối list
    //     list.add(0, "Python");         // Chèn phần tử vào vị trí index chỉ định
    //     list.addAll(Arrays.asList("C#", "JS")); // Thêm tất cả phần tử từ một collection khác

    //     // --- NHÓM TRUY XUẤT & CẬP NHẬT ---
    //     list.get(1);                    // Lấy giá trị phần tử tại vị trí index
    //     list.set(2, "C++");             // Thay thế/Cập nhật phần tử tại vị trí index
    //     list.size();                    // Trả về số lượng phần tử (độ dài) của list
        
    //     // --- NHÓM TÌM KIẾM & KIỂM TRA ---
    //     list.contains("Java");          // Kiểm tra phần tử có tồn tại hay không (true/false)
    //     list.indexOf("Python");         // Trả về vị trí đầu tiên của phần tử (-1 nếu không thấy)
    //     list.lastIndexOf("Java");       // Trả về vị trí cuối cùng của phần tử
    //     list.isEmpty();                 // Kiểm tra list có rỗng hay không

    //     // --- NHÓM XÓA ---
    //     list.remove(0);                 // Xóa phần tử tại vị trí index
    //     list.remove("C++");             // Xóa phần tử cụ thể đầu tiên được tìm thấy
    //     list.removeAll(otherList);      // Xóa tất cả phần tử có trong danh sách khác
    //     list.clear();                   // Xóa sạch toàn bộ phần tử trong list

    //     // --- NHÓM XỬ LÝ NÂNG CAO ---
    //     Collections.sort(list);         // Sắp xếp các phần tử trong list
    //     list.toArray();                 // Chuyển ArrayList thành mảng (Array)
    //     list.subList(0, 2);             // Trích xuất một list con từ index start đến end-1
    //     list.clone();                   // Tạo một bản sao nông (shallow copy) của list
    //     list.ensureCapacity(50);        // Tăng dung lượng bộ nhớ đệm cho list
    //     list.trimToSize();              // Thu nhỏ bộ nhớ đệm khớp với số phần tử hiện tại
        
    //     // --- NHÓM DUYỆT (JAVA 8+) ---
    //     list.forEach(item -> {});       // Duyệt qua từng phần tử bằng Lambda
    //     list.removeIf(n -> n.isEmpty());// Xóa phần tử nếu thỏa mãn điều kiện
    // 
    //         // 1. list.removeIf(n -> condition)
    //         // Ví dụ: Xóa tất cả các chuỗi rỗng (empty) trong danh sách
    //         languages.removeIf(n -> n.isEmpty()); 
    //         // Sau lệnh này: ["Java", "Python", " ", "C++"] (Chuỗi có khoảng trắng " " vẫn còn vì nó không empty)

    //         // 2. list.forEach(item -> action)
    //         // Ví dụ: Duyệt và in từng phần tử kèm theo tiền tố
    //         languages.forEach(lang -> System.out.println("Ngôn ngữ: " + lang));
            
    //         // Ví dụ 2: Viết hoa tất cả và in ra
    //         languages.forEach(lang -> System.out.println(lang.toUpperCase()));
}
    