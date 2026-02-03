package prj1;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class p08_HashSet_LinkedHashSet_TreeSet_ {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    //----- Lý thuyết trong slide

    //----- Cái ko có trong slide

        TreeSet<Integer> ab = new TreeSet<>(); // tăng dần
        TreeSet<Integer> ba = new TreeSet<>(Collections.reverseOrder()); // giảm dần

        for(int i=0;i<4;i++) ab.add(sc.nextInt()); ab.forEach(x->System.out.print(x+" "));
        System.out.println();
        for(int i=0;i<4;i++) ba.add(sc.nextInt()); ba.forEach(x->System.out.print(x+" "));

        sc.close();
    }
}
