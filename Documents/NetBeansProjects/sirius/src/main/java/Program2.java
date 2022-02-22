import java.util.*;
public class Program2
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ret="";
		for(int i=0;i<str.length();i++)
		{
		    int count=0;
		    for(int j=0;j<str.length();j++)
		    {
		        if(str.charAt(i)==str.charAt(j))
		        {
		            ++count;
		        }
		    }
		    if(ret.contains(""+str.charAt(i)))
		    {
		        continue;
		    }
		    else
		    {
		        ret+=str.charAt(i);
		        ret+=String.valueOf(count);
		    }
		}
		System.out.println(ret);
	}
}