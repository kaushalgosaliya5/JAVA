import java.util.Scanner;

class Area{

 public static void main(String args[]) {

   int length,breath;

   Scanner sc = new Scanner(System.in);   

   System.out.println(" ENTER LENGTH OF SQUARE ::  ");
   length = sc.nextInt();

   System.out.println(" AREA OF SQUARE IS :: " + area(length));

   System.out.println(" ENTER LENGTH OF RECTANGLE :: ");
   length = sc.nextInt();

   System.out.println(" ENTER BREATH OF RECTANGLE :: ");
   breath = sc.nextInt();

   System.out.println(" AREA OF RECTANGLE IS :: " + area(length,breath));
  }

  static int area(int l) {
    return 4 * l;
  }
 
  static int area(int l,int b) {
    return 2 * (l+b);
  }
}