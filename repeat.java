import java.util.*;
public class repeat {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String st=in.next();
        int x=1;
        int count=1;
        char ch[]=st.toCharArray();
        for(int i=1;i<st.length();i++)
        {
            if(ch[i]==ch[i-1])
            {
                count++;
                x=Math.max(x,count);
            }
            else
            {
                count=1;
            }

        }
        System.out.println(x);
        in.close();
    }
}
