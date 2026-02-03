package prj1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class p10_ComparatorSort_ {
    public static void main(String[] args) {
    
    //----- Mảng tĩnh "Arrays"
        Integer[] a = {9,8,7,6,5,4,3,2,1,0};

        Arrays.sort(a); // xuôi

        for(int i=0;i<10;i++) System.out.print(a[i]+" ");

        Arrays.sort(a,Collections.reverseOrder()); // ngược, phải là kiểu Integer mới dùng được, int ko dùng được

        System.out.println();
        for(int i=0;i<10;i++) System.out.print(a[i]+" ");
        
        Arrays.sort(a,3,7); // từ "3->trước 7" nếu bắt đầu từ 0, từ "sau 3 -> 7" nếu bắt đầu từ 1.

        System.out.println();
        for(int i=0;i<10;i++) System.out.print(a[i]+" ");

    //----- Mảng động "Collections"
        ArrayList<Integer> b = new ArrayList<>();
        
        for(int x: a) b.add(x);

        System.out.println();
        Collections.sort(b); b.forEach(x->System.out.print(x+" "));

        System.out.println();
        Collections.sort(b,Collections.reverseOrder()); b.forEach(x->System.out.print(x+" "));

       // Comparison function
            // B1: Tìm thứ tự muốn sắp xếp              : Muốn tăng dần
            // B2: Tìm điều kiện để x đứng trước y      : x phải nhỏ hơn y
            // B3: Điều kiện đúng --> -1, sai --> 1     : x<y ? -1 : 1; hoặc x-y
       System.out.println();
       Collections.sort(b, new Comparator<Integer>() {
            public int compare(Integer x, Integer y){ // Kiểu trả về luôn là int
                return x < y ? -1 : 1 ; // hoặc "x-y"
            }
       });
       


    }
}
