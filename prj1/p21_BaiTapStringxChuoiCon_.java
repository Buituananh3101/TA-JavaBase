package prj1;

public class p21_BaiTapStringxChuoiCon_ {

    public static String soSanhChuoiDaiVaLonHon(String a, String b){
        if(a.length()<b.length()) return b;
        if(a.length()>b.length()) return a;
        if(a.compareTo(b)>0) return a; else return b;
    }

    public static String chuoiConDaiVaLonNhat(String s){
        String res=s.charAt(0)+"", tmp=res;

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) tmp+=s.charAt(i);
            else{
                res = soSanhChuoiDaiVaLonHon(res, tmp);
                tmp=s.charAt(i)+"";
            }
        }

        return res;
    }

    public static void main(String[] args) {
        
    //----- Chuỗi con dài và lớn nhất
    System.out.println("-----------------");

        System.out.println(chuoiConDaiVaLonNhat("aabbbbcbbbbbdd"));

    }
}
