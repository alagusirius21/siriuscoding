import java.util.*;
public class Program1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ret="";
		for(int i=0;i<str.length();i++)
		{
		    int num=0;
		    if(i%2!=0)
		    {
		        num=Integer.parseInt(""+str.charAt(i));
		        for(int j=0;j<num;j++)
		        {
		            ret+=str.charAt(i-1);
		        }
		    }
		}
		System.out.println(ret);
	}
}
