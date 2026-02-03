package prj1;

public class p20_BaiTapStringxThamLam_ {


    public static String mDigitSumDigitS(int m, int s){
        if(m*9<s || (s==0 && m<=0)) return "";
        int[] min = new int[m];
        int[] max = new int[m];

        int t=s;
        
        for(int i=0;i<s;i++){
            if(s > 9) { max[i]=9; s-=9;}
            else{ max[i]=s; s=0;}
        }

        t--; // Để dành 1 đơn vị
        for(int i=m-1;i>=0;i--){
            if(t > 9){ min[i]=9; t-=9;}
            else{ min[i]=t; t=0;}
        }
        min[0]+=1;

        String smin = "";
        String smax = "";

        for(int x: min) smin+=x;
        for(int x: max) smax+=x;

        return smin+"\n"+smax;
    }

    public static void main(String[] args) {
        
    //----- Số min max có m digit & tổng các digit bằng s
        
        System.out.println(mDigitSumDigitS(3, 15));

    }
}
