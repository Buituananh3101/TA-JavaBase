package prj1;

import java.util.Scanner;

public class p17_NhapString_ {
   
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //----- Quá trình đọc
        // sc.next()            // Đọc đến dấu cách thì dừng
        // sc.nextLine()        // Đọc đến enter thì dừng, đọc cả enter

    //----- Đọc số và chữ
        // 100
        // Tuan Anh

        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();

        // hoặc

        int nn = sc.nextInt(); sc.nextLine();
        String ss = sc.nextLine();

    //----- Đọc không biết trước số lượng dòng
        String sss = "";
        while(sc.hasNextLine()) sss = sc.nextLine();

    //----- Đọc không biết trước số lượng từ
        String ssss ="";
        while(sc.hasNext()) ssss = sc.next();

        
    }
}
