package prj1;

import java.util.Scanner;

public class p06_Mang_1C_ {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();

        // Khai báo mảng động n phần tử
        int[] a = new int[n];

        // Nhập phần tử
        for(int i=0;i<n;i++) a[i] = sc.nextInt();

        // hàm lengh cho mảng tĩnh
        int m = a.length;
        
        
        sc.close();
    }
}
