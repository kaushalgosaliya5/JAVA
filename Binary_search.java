import java.util.Scanner;

class Binary_search {

   public static void main(String args[]) {
 
   int num[]=new int[5];
   int i,val;
   int min,mid,max;

   Scanner sc = new Scanner(System.in);

   for(i=0;i<num.length;i++)
   {
      System.out.println(" ENTER NUMBER " + (i+1) + " :: ");
      num[i] = sc.nextInt();
   }

   System.out.println(" ENTER WHICH NUMBER TO SELECT :: ");
   val = sc.nextInt();

   min = 0;
   max = num.length-1;
  
   for(mid=(min+max)/2;max>=min;mid=(min+max)/2)
   {
      if(num[mid] == val)
      {
        System.out.println(" YOUR VAL IS " + (mid+1) + " POSITION ");
        break;
      }
      else if(num[mid] > val)
      {
         max = mid - 1;
      } 
      else  
      {
         min = mid + 1;
      }  
   }

   if(max < min)
   {
     System.out.println(" YOUR VALUE IS NOT FOUND");
   }

  }
 }