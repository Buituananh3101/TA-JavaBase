package prj1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class p19_BaiTapString_ {
    
    public static String chuanHoaTen1(String s){
        String[] as = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String x: as){
            res += Character.toUpperCase(x.charAt(0));
            res += x.substring(1, x.length());
            res +=" ";
        }
        return res.trim();
    }

    public static String chuanHoaNgaySinh(String s){
        String[] as = s.trim().split("/");
        String res = String.format("%02d/%02d/%04d",Integer.parseInt(as[0]),Integer.parseInt(as[1]),Integer.parseInt(as[2]));
        return res;
    }

    public static String chuanHoaTen2v1(String s){ // Ver 1

        String[] as = s.trim().toLowerCase().split("\\s+");
        ArrayList<String> als = new ArrayList<>();
        for(String x:as) als.add(x);
        
        String res = als.get(als.size()-1).toUpperCase() + ", ";
        for(int i=0;i<als.size()-1;i++){
            res+= Character.toUpperCase(als.get(i).charAt(0));
            res+= als.get(i).substring(1,als.get(i).length());
            res+= " ";
        }

        return res.trim();
    }

    public static String chuanHoaTen2v2(String s){ // Ver 2
        String[] as = s.trim().toLowerCase().split("\\s+");
        String res = as[as.length - 1].toUpperCase()+", ";
        for(int i=0;i<as.length-1;i++){
            res += Character.toUpperCase(as[i].charAt(0));
            res += as[i].substring(1,as[i].length());
            res += " ";
        }
        return res.trim();
    }

    public static String taoEmailVaMatKhau(String s){
        String[] as = s.trim().toLowerCase().split("\\s+");
        int n = as.length;

        String res = as[n-2];
        for(int i=0;i<n-2;i++) res+=as[i].charAt(0);
        res += "@gmail.com";

        res+="\n";

        String ngaySinh = as[n - 1];
        String[] aas = ngaySinh.split("/");
        for(String x: aas) res+= Integer.parseInt(x)+"";

        return res;
    }

    public static LinkedHashSet<String> taoEmailVaMatKhauTrungTen(String[] a){
        HashMap<String,Integer> m = new HashMap<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(String x: a){
            x = taoEmailVaMatKhau(x);
            String[] ax = x.split("@");
            if(m.containsKey(ax[0])){
                m.put(ax[0],m.get(ax[0])+1);
                set.add(ax[0]+m.get(ax[0])+"@"+ax[1]);
            }
            else{
                m.put(ax[0],1);
                set.add(x);
            }
        }
       return set;
    }

    public static long tongSoTrongChuoi(String s){
        String[] as = s.split("\\D+");
        long sum=0;
        for(String x:as) if(x=="") continue; else sum += Integer.parseInt(x);
        return sum;
    }

    public static long soLonNhatTrongChuoi(String s){
        String[] as = s.split("\\D+");
        long max=0;
        for(String x:as) if(x=="") continue; else max = max < Integer.parseInt(x) ? Integer.parseInt(x) :max;
        return max;
    }

    public static String soSanhSoCucLon(String a, String b){
        if(a.length()<b.length()) return b;
        if(a.length()>b.length()) return a;
        if(a.compareTo(b)>0) return a; else return b;
    }

    public static String loaiBoSoKhongDauChuoi(String s){
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>=1 && sb.charAt(0)=='0') sb.deleteCharAt(0);
        return sb.toString();
    }

    public static String soCucLonTrongChuoiLonNhat(String s){
        String[] as = s.split("\\D+");

        for(int i=0;i<as.length;i++) as[i] = loaiBoSoKhongDauChuoi(as[i]);

        String max = "";
        for(String x:as) if(x=="") continue; else max = soSanhSoCucLon(x, max);
        
        return max;
    }

    public static String demSoLuongChuSoKiTuDacBiet(String s){
        int chu=0, so=0, ktdb=0;
        for(char x: s.toCharArray()){
            if     (Character.isLetter(x)) chu++;
            else if(Character.isDigit(x))  so++;
            else                           ktdb++;
        }
        return "chu:"+chu + "\nso:" + so + "\nki tu dac biet:" + ktdb;
    }

    public static String ghepXauTaoRaChuoiLonNhat(String s){
        String[] as = s.trim().split("\\s+");
        Arrays.sort(as, new Comparator<String>() {
            public int compare(String a, String b){
                String x = a+b;
                String y = b+a;
                return y.compareTo(x);
            }
        });
        String res="";
        for(String x: as) res+=x;
        return res;
    }

    public static void main(String[] args) {
    
    //----- Chuẩn hóa tên & ngày sinh
        
        System.out.println(chuanHoaTen1("  bui TuaN  ANH")); // Bui Tuan Anh
        System.out.println(chuanHoaNgaySinh("1/1/2025"));    // 01/01/2025
        System.out.println(chuanHoaTen2v1("  bui TuaN  ANH"));
        System.out.println(chuanHoaTen2v2("  bui TuaN  ANH"));

    //----- Tạo email & mật khẩu
    System.out.println("---------------------");

        System.out.println(taoEmailVaMatKhau("bui TuaN  ANH   1/01/2025"));

        String[] danhSach = {
            "nguyen   van LONg 20/10/2002",
            "ngo Vang Long 20/12/2002",
            "Nguyen  Vu Long 22/12/2003",
            "ho van   nam 17/09/2002",
            "nguyen   vo LONG 20/10/1999"
        };
        LinkedHashSet<String> set = taoEmailVaMatKhauTrungTen(danhSach);
        for(String x: set) System.out.println(x);
        
    //----- Số trong chuỗi
    System.out.println("---------------------");

        System.out.println(tongSoTrongChuoi("ieat1gih2gihg3 3jk"));
        System.out.println(soLonNhatTrongChuoi("ieat1gih2gihg3 13jk"));
        System.out.println(soCucLonTrongChuoiLonNhat("ieat001111111111111111111111111111gih2gihg3 13jk"));

    //----- Đếm số lượng chữ, số, kí tự đặc biệt
    System.out.println("---------------------");

        System.out.println(demSoLuongChuSoKiTuDacBiet("aabb@@123"));

    //----- Ghep xau thoa man dieu kien
    System.out.println("---------------------");

        System.out.println(ghepXauTaoRaChuoiLonNhat("bca bc"));

    //----- Tổng hợp mẹo regex
    System.out.println("---------------------");

        String[] as1 = "Bui T1u2 Anh".split("\\s+"); // ["Bui", "T1u2", "Anh"]
        String[] as2 = "Bui T1u2 Anh".split("\\D+"); // ["", "1", "2"]
        String[] as3 = "Bui T1u2 Anh".split("\\d+"); // ["Bui T", "u", " Anh"]
    }

    

}
