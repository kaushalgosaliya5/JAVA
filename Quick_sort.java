import java.util.Scanner;

class Quick_sort
{   
  public static void main(String args[])
  {
    int arr[]=new int[6];
    int i;
    
    Scanner sc = new Scanner(System.in);

    for(i=0;i<arr.length;i++)
    {
      System.out.println("\n enter value " + (i+1) + " :: ");
      arr[i] = sc.nextInt();
    }
 
    System.out.println("\n array before sorting :: ");

   for(i=0;i<arr.length;i++)
   {
     System.out.print(" " + arr[i]);
   }

   quicksort(arr,0,arr.length-1);
 
   System.out.println("\n array after sorting :: ");

   for(i=0;i<arr.length;i++)
   {
     System.out.print("  " + arr[i]);
   }
  }

 static void quicksort(int arr[],int lower,int upper)
  {
    int mid;

    if(lower < upper)
    {
      mid = split(arr,lower,upper);
 
      quicksort(arr,lower,mid-1);
      quicksort(arr,mid+1,upper);
    }
  }

 static int split(int arr[],int lower,int upper)
 {
   int i,p,q,t;

   p = lower + 1;
   q = upper;

   i = arr[lower];

   while(p <= q)
   {
     while(arr[p] < i)
      {
       p++;
      }

     while(arr[q] > i)
     {
       q--;
     }

     if(q > p)
     {
       t = arr[p];
       arr[p] = arr[q];
       arr[q] = t;
     }
   }

   t = arr[lower];
   arr[lower] = arr[q];
   arr[q] = t;

   return q;
 } 
}