import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int f=1,i=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=1;i<=n;i++) {
            f=f*i;
        }
        System.out.println(f);
    }
}
