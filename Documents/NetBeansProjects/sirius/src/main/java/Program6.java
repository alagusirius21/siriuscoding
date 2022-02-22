import java.util.*;
       class Program6{
public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
      
	int space,num;
      for(int i=0; i<row; i++)
      {
         for(space=row; space>i; space--)
         {
            System.out.print(" ");
         }
         num=1;
         for(int j=0; j<=i; j++)
         {
            System.out.print(num+ " ");
            num = num*(i-j)/(j+1);
         }
         System.out.print("\n");
      }
   }
}