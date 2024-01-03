import java.util.*;
public class distinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long arr[]=new long[(int)n];
        HashSet<Long>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong(); 
        } for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        System.out.println(set.size());
        //sc.close();
    }
}
