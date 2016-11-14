import java.util.Scanner;


class Array2
{
  public static void main(String args[])
  {
    int a[][] = new int[3][];
    int i,j;

     a[0] = new int[2];
     a[1] = new int[3];
     a[2] = new int[4];

    Scanner sc = new Scanner(System.in);

    
    for(i=0;i<a.length;i++)
    {
      for(j=0;j<a[i].length;j++)
      {
        System.out.print(" ENTER VALUE " + (j+1) + " :: ");
        a[i][j] = sc.nextInt();
      }
      System.out.println(""); 
    }

    System.out.println(" NEW ARRAY IS :: ");
 
    for(i=0;i<a.length;i++)
    {
      for(j=0;j<a[i].length;j++)
      {
        System.out.print("  " + a[i][j]);
      }
     System.out.println("");
    }
  }
}