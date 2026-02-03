package prj1;


public class p05_Ham_ {

    public static void XinChao(int n) {
        System.out.println("Xin chao: "+ n);
    }

    public static int getNumber(int a, int b) {
        return a+b;
    }

    public static boolean chanLe(int n) {
        return n%2==0?true:false;
    }
    
    public static void main(String[] args) {
        XinChao(31);
        System.out.println(getNumber(2, 3));
        System.out.println(chanLe(3));
    }
}
