import java.util.*;
class Program5 {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f=f*i;
        }
        System.out.println(f);
        String str=String.valueOf(f);
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='0')
            {
                ++count;
            }
            if(str.charAt(i)!='0')
            {
                break;
            }
        }
        System.out.println(count);
    }
}