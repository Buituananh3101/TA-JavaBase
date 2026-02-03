package prj1;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.StringTokenizer;


public class p18_StringFull_ {
    public static void main(String[] args) {
        
        String s =" Bu?i Tuan Anh Tuan ANH ";
    
    //----- Hay dùng
    System.out.println("-----------------------------------------------");
        System.out.println(s.length());

        for(int i=0;i<s.length();i++) System.out.println(s.charAt(i));

        // Có thể thay cả xâu nhưng ko thể thay trực tiếp từng kí tự trong xâu

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
        s+=" dep trai"; System.out.println(s);
    
    //----- Kiểu kí tự
    System.out.println("------------------------");


        int hoa=0, thuong=0, so=0;
        for(char x : s.toCharArray()){ // forx để duyệt xâu
            if(Character.isLowerCase(x)) thuong ++;
            if(Character.isUpperCase(x)) hoa++;
            if(Character.isDigit(x)) so++;
        }
        System.out.println(thuong + " " + hoa + " " + so);
        

    //----- Tách xâu thành token bằng regex (Cách 1) Nếu delim là dấu cách thì dùng cái này tiện
    System.out.println("------------------------ 1");


        String[] arr = s.trim().split("\\s+"); // trim tỉa cách đầu cách cuối, tách dựa vào dấu cách
        for(String x: arr) System.out.println(x + " "); 


    //----- Tách xâu thành token bằng lớp (Cách 2) Nếu delim gồm nhiều loại thì dùng cái này tiện
    System.out.println("------------------------ 2");


        StringTokenizer st = new StringTokenizer(s," ?"); // delim tách là " ", "?","?." theo mấy loại cx được.
        while(st.hasMoreTokens()) System.out.println(st.nextToken());


    //----- Đưa vào HashSet để loại bỏ giống nhau
    System.out.println("------------------------");


        String[] arrr = s.trim().toLowerCase().split("\\s+");
        HashSet<String> set = new HashSet<>();
        for(String x: arrr) set.add(x);
        set.forEach(x-> System.out.print(x+" "));
    

    //----- Đếm token bằng map
    System.out.println("\n------------------------");


        String[] arrrr = s.trim().toLowerCase().split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String x: arrrr){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(Map.Entry<String,Integer> x: map.entrySet()) System.out.println(x.getKey()+" "+x.getValue());


    //----- So sánh ngày sinh
    System.out.println("------------------------");


        String sa = "12/21/2000"; //string a
        String sb = "30/02/1999";

        String[] asa = sa.split("/"); // array string a
        String[] asb = sb.split("/");

        String san = asa[2] + asa[1] + asa[0]; // string a new
        String sbn = asb[2] + asb[1] + asb[0];

        if(san.compareTo(sbn)<0) System.out.println("a>b");
        else if(san.compareTo(sbn)>0) System.out.println("a<b");
        else System.out.println("a=b");


    //----- StringBuilder
    System.out.println("------------------------");


        StringBuilder sbder = new StringBuilder(s);
        System.out.println(sbder.toString()); // Phải có .toString khi in
        System.out.println(sbder.reverse().toString());
        System.out.println(sbder.deleteCharAt(0).toString());
        sbder.setCharAt(0, 'L'); System.out.println(sbder.toString());

        for(char x: sbder.toString().toCharArray()) System.out.println(x);

    //----- BigInteger
    System.out.println("------------------------");
        

        String x = "84756483765874263985";
        String y = "8273453465384756348756328456777";
        BigInteger bx = new BigInteger(x);
        BigInteger by = new BigInteger(y);
        System.out.println(bx.add(by));
        System.out.println(bx.subtract(by));
        System.out.println(bx.multiply(by));
        System.out.println(bx.divide(by));


    //----- String.format
    System.out.println("------------------------");

        String sf = String.format("%08d", 1234); System.out.println(sf);
        System.out.printf("%08d \n",4321);
        
        // Output
        // 00001234
        // 00001234 

    //----- Lưu ý
        // So sánh 2 xâu dùng equal
    }
    
}
