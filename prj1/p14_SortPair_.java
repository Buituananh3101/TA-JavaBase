package prj1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Cho mảng A[] gồm N điểm trong hệ tọa độ Oxy, 
// hãy sắp xếp các điểm này theo khoảng cách về gốc tọa độ tăng dần, 
// nếu 2 điểm có cùng khoảng cách tới gốc tọa độ thì in ra theo hoành độ tăng dần, 
// nếu tiếp tục 2 điểm này có cùng hoành độ thì in ra theo thứ tự tung độ tăng dần.

public class p14_SortPair_ {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer>[] a = new ArrayList[n];
        for(int i=0;i<n;i++){
            a[i] = new ArrayList<>();
            a[i].add(sc.nextInt());
            a[i].add(sc.nextInt());
        }

        Arrays.sort(a, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> x, ArrayList<Integer> y){
                int dx = x.get(0)*x.get(0) + x.get(1)*x.get(1);
                int dy = y.get(0)*y.get(0) + y.get(1)*y.get(1);
                if(dx != dy) return dx-dy;
                else if(x.get(0)!=y.get(0)) return x.get(0) - y.get(0);
                else return x.get(1) - y.get(1);
            }
        });

        for(ArrayList<Integer> x: a) System.out.println(x.get(0)+" "+x.get(1));

// 6
// 1 1
// -1 -1
// 0 0
// 2 2
// 1 -1
// -1 1
    }
}
