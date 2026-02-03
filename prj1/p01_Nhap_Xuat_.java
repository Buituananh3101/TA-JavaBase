package prj1;

//ctrl F5 để chạy

import java.util.Scanner;

public class p01_Nhap_Xuat_ {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

    //----- Các loại print

        // 1. ln = line tự động xuống dòng
        System.out.println("Hello");
        System.out.println("xin chao nha");
        
        // 2. f = format ko xuống dòng : như Cpp
        System.out.printf("Hi");
        System.out.printf("Hi\n");
        
        // 3. Giống println nhưng ko tự động xuống dòng
        System.out.print("Hi");
        System.out.print("Hi\n");

    //----- Quy trình nhập dữ liệu

        // Khai báo
        Scanner sc = new Scanner(System.in);

        // Nhập số 
        float a = sc.nextFloat();
        System.out.println(a);
        System.out.printf("%.2f\n",a);

        // Nhập chữ
        char c = sc.next().charAt(0);
        System.out.println(c);

        // Nhập vừa số vừa chữ mà ko bị trôi lệnh (1)
        int n = Integer.parseInt(sc.nextLine());
        String ss = sc.nextLine();

        // Nhập vừa số vừa chữ mà ko bị trôi lệnh (2)
        int nn = sc.nextInt(); sc.nextLine();
        String sss = sc.nextLine();

        sc.close();// Cho vào để nó ko cảnh báo vàng
    }
}
