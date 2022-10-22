import java.util.Scanner;
public class Array_Even_Odd_nums
{
   static void Even(int[] arr, int n)
    {
       int[] arr1=new int[n];
       arr1=arr;
       for(int i=0;i<arr1.length;i++)
        {
           if(arr1[i]%2==0)
            {
               System.out.println("Even Number :"+arr1[i]);
            }
        }
    } 
    static void Odd(int[] arr, int n)
    {
       int[] arr1=new int[n];
       arr1=arr;
       for(int i=0;i<arr1.length;i++)
        {
           if(arr1[i]%2!=0)
            {
               System.out.println("Odd Number :"+arr1[i]);
            }
        }
    } 
   public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter no.of elements of an array :");
      int n=sc.nextInt();
      int[] arr=new int[n];
      System.out.println("Enter elements in an array :");
      for(int i=0;i<arr.length;i++)
       {
          arr[i]=sc.nextInt();
       }
        System.out.println("");
        Even(arr,n);
        System.out.println("");
        Odd(arr,n);
    }
}
