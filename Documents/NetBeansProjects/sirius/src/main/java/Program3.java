import java.util.*;
public class Program3
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		Arrays.sort(arr);
		String ret="";
		for(int i=0;i<arr.length;i++)
		{
		    ret+=arr[i];
		    ret+=" ";
		}
		System.out.println(ret);
		
	}
}