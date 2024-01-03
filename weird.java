import java.util.Scanner;

public class weird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        
        StringBuilder result = new StringBuilder();

        while (n != 1) {
            result.append(n).append(" ");
            boolean isOdd = (n & 1) == 1;

            if (isOdd) {
                n = n * 3 + 1;
            } else {
                n = n / 2;
            }
        }

        result.append("1");
        System.out.println(result);

        // Close the Scanner
        in.close();
    }
}
