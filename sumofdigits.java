import java.util.*;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0,i;
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
            s=s+i;
        System.out.println(s);
    }
}