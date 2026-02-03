package prj1;

import java.util.Scanner;

public class p29_TryCatch_ {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{

            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(n/m);
            System.out.println(n);

        }catch(Exception e){

            System.out.println("Sai type hoac loi chia cho 0");
            e.printStackTrace(); // In lỗi

        }finally{
            System.out.println("Bạn đã xong rồi!");
        }

        System.out.println("Hi");


        sc.close();
    }
}   
