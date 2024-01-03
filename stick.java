import java.util.*;
class stick {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long arr[]=new long[(int)n];
        for(int i =0;i<n;i++)
        {
            arr[i]=in.nextLong();
        }
        Arrays.sort(arr);
       // long mid=-1;
         long mid=arr[(int)n/2];
            long s=0;
            for(int i=0;i<n;i++)
            {
                s+=Math.abs(arr[i]-mid);
            }
            System.out.println(s);
            in.close();

    }
}