import java.util.Scanner;

class Merge_sort
{
  public static void main(String args[])
  {
    int arr[] = new int[6];
    int i;

    Scanner sc = new Scanner(System.in);

    for(i=0;i<arr.length;i++) 
    {
      System.out.print(" ENTER ELEMENT " + (i+1) + " :: ");
      arr[i] = sc.nextInt();
    }

    System.out.print(" ARRAY BEFORE SORTING :: ");

    for(i=0;i<arr.length;i++)
    {
      System.out.print(" " + arr[i]);
    }

    mergesort(arr,0,(arr.length-1));

    System.out.println("\n ARRAY AFTER SORTING :: ");

    for(i=0;i<arr.length;i++)
    {
      System.out.print(" " + arr[i]);
    }
  }

 public static void mergesort(int arr[],int beg,int end)   
  {
    int mid;
 
    if(beg < end)
    {
      mid = (beg+end) / 2;

      mergesort(arr,beg,mid);
      mergesort(arr,mid+1,end);

      merge(arr,beg,mid,end);
    }
  }

  public static void merge(int arr[],int beg,int mid,int end)
  {
    int i=beg,j=mid+1,index=beg,k,tmp[]=new int[arr.length];

    while((i <= mid) && (j <= end))
    {
      if(arr[i] < arr[j])
      {
        tmp[index] = arr[i];
        i++;
        index++;
      }
      else
      {
        tmp[index] = arr[j];
        j++;
        index++;
      }
    }

    if(i > mid)
    {
      while(j <= end)
      {
        tmp[index] = arr[j];
        j++;
        index++;
      } 
    }
    else
    {
      while(i <= mid)
      {
        tmp[index] = arr[i];
        i++;
        index++;
      }
    }

    for(k=beg;k<index;k++)
    {
      arr[k] = tmp[k];
    }
  } 
}