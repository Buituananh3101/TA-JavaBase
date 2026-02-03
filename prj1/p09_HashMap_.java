package prj1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class p09_HashMap_ {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    //----- Khai báo
        HashMap<Integer,Integer> m = new HashMap<>();

    //----- Hàm
        m.put(1,2);
        m.put(2,2);
        m.put(3,2);
        m.put(4,2);
        m.put(5,2);
        
    //----- Duyệt
        for(Map.Entry<Integer,Integer> x : m.entrySet()){// mỗi phần tử map là phần tử entry, đọc trong tập các entry
            System.out.println(x.getKey()+" "+x.getValue());
        }


    //----- Test mảng cộng dồn int int
        System.out.println("----------------");

        HashMap<Integer,Integer> a = new HashMap<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(a.containsKey(x)) a.put(x,a.get(x)+1);
            else a.put(x, 1);
        }
        for(Map.Entry<Integer,Integer> x : a.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
    
    //----- Test mảng cộng dồn string int với mỗi string trên 1 dòng & ko biết trước số lượng.
        System.out.println("----------------");

        HashMap<String,Integer> b = new HashMap<>();
        while(sc.hasNextLine()){// ctr Z để dừng nhập
            String s = sc.nextLine();
            if(b.containsKey(s)) b.put(s,b.get(s)+1);
            else b.put(s, 1);
        }
        for(Map.Entry<String,Integer> x : b.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }



        sc.close();
    }
}
