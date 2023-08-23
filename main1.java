// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int i=0;
            int sum=0;
            int c=0;
            while(true)
            {
                if(sum<=a)
                {
                sum=sum+b;
                c++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(c-1);
            t--;
        }
    }
}