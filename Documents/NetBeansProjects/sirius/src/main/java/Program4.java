import java.util.*;
public class Program4
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String ret="";
		ArrayList<Integer> length=new ArrayList<Integer>();
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
		    length.add(arr[i].length());
		}
		int max=Collections.max(length);
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i].length()==max)
		    {
		        ret+=arr[i];
		        ret+=" ";
		        ret+=String.valueOf(max);
		    }
		}
		System.out.println(ret);
	}
}