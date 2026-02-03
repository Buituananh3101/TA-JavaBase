package prj1;

import java.util.ArrayList;
import java.util.Scanner;

public class p16_Mang_2C_ {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    //----- Static
        int[][] a = new int[3][3];

        for(int i=0;i<3;i++) for(int j=0;i<3;j++) a[i][j] = sc.nextInt();

        for(int i=0;i<3;i++) for(int j=0;j<4;j++) System.out.println(a[i][j]+" "); // chưa form, duyệt theo hàng 
        for(int i=0;i<4;i++) for(int j=0;j<3;j++) System.out.println(a[j][i]+" "); // chưa form, duyệt theo cột

    //----- Substatic
        ArrayList<Integer>[] b =new ArrayList[10];

        for(int i=0;i<10;i++){
            b[i] = new ArrayList<>();
            for(int j=0;j<10;j++) b[i].add(sc.nextInt());
        }

        for(int i=0;i<10;i++) for(int j=0;i<10;j++) System.out.println(b[i].get(j)+" "); // chưa form

    //----- Dynamic
        ArrayList<ArrayList<Integer>> c = new ArrayList<>();

        for(int i=0;i<10;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<10;j++) row.add(sc.nextInt());
            c.add(row);
        }

        for(int i=0;i<10;i++) for(int j=0;j<10;j++) System.out.println(c.get(i).get(j)+" ");
    }
}
