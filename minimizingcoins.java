import java.util.*;
public class minimizingcoins {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       long n=in.nextLong();
       long target=in.nextLong();
       long arr[]=new long[(int)n];
       for(int i=0;i<n;i++)
       {
        arr[i]=in.nextLong();
       }
       long dp[]=new long[(int)target+1];
       Arrays.fill(dp,Integer.MAX_VALUE);
       dp[0]=0;
       for(int i=1;i<=target;i++)
       {
        for(int j=0;j<arr.length;j++)
        {
            if(i-arr[j]>=0 && dp[(int)(i-arr[j])]!=Integer.MAX_VALUE)
            {
                dp[i]=Math.min(dp[i],1+dp[(int)(i-arr[j])]);
            }
        }
    }
        if(dp[(int)target]==Integer.MAX_VALUE)
        System.out.println("-1");
        else
        System.out.println(dp[(int)target]);
}
}
