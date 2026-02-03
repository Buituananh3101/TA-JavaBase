package prj1;

public class p13_BinarySearch_Lower_Upper_ {
    public static int lower(int a[], int l, int r, int x){
        int res=-1;
        while(l<r){
            int m=(l+r)/2;
            if(a[m]>=x){
                res = m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return res;
    }
    public static int upper(int a[], int l, int r, int x){
        int res=-1;
        while(l<r){
            int m=(l+r)/2;
            if(a[m]<=x){
                res = m;
                l=m+1;
            }else{
                r=m-1;                
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(a[lower(a,0,5,4)]);
        System.out.println(a[upper(a,0,5,4)]);

    }
}
