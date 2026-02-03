package prj1;
import java.util.Scanner;

public class p03_If_Else_ {

    public static void main(String[] args) {
        // Như Cpp
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n%400==0||(n%4==0&&n%100==0)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        
        
        sc.close();
    }
}
