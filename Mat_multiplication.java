import java.util.Scanner;

class Mat_multiplication 
{
  static public void main(String args[])
  {
    int i,j,k;
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];

    Scanner sc = new Scanner(System.in);
    
    System.out.println(" ENTER FIRST MATRIX VALUE :: ");

    for(i=0;i<a.length;i++) 
    {
      for(j=0;j<a[i].length;j++)
      {
       System.out.println(" ENTER VALUE " + (j+1) + " :: ");
       a[i][j] = sc.nextInt();
      }
    }     
    
    System.out.println(" ENTER SECOND MATRIX VALUE :: ");

    for(i=0;i<b.length;i++) 
    {
      for(j=0;j<b[i].length;j++)
      {
       System.out.println(" ENTER VALUE " + (j+1) + " :: ");
       b[i][j] = sc.nextInt();
      }
    }     
    
    for(i=0;i<a.length;i++) 
    {
      for(j=0;j<a[i].length;j++)
      {
	 c[i][j] = 0;
    
         for (k=0;k<a[i].length;k++)
         {
	    c[i][j] = c[i][j] + ( a[i][k] *  b[k][j] );
	 }        
      }
    }     
    
    System.out.println(" NEW MATRIX IS :: ");

    for(i=0;i<a.length;i++) 
    {
      for(j=0;j<a[i].length;j++)
      {
       System.out.print(" " + c[i][j]);
      }
     System.out.println("");
    }     
  }
}