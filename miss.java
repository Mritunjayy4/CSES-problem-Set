import java.util.*;
public class miss {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long arr[]=new long[(int)(n-1)];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=in.nextLong();
        }
        long sum=(n*(n+1))/2;
        long p=0;
        for(int i=0;i<n-1;i++)
        {
            p+=arr[i];
    }
    System.out.println(sum-p);
    in.close();
    //System.err.println();
}
}
