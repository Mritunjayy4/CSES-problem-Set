import java.util.*;
public class coin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long arr[]=new long[(int)n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextLong();
        }
            Arrays.sort(arr);
            if(arr[0]>1){
            System.out.println("1");
            return;}
            long s=0;
            for(int i=0;i<n;i++)
            {
                if(s+1<arr[i])
                {
                    System.out.println(s+1);
                    return ;
                }
                s+=arr[i];
            }
            System.out.println(s+1);
            return ;


          
    }
}
