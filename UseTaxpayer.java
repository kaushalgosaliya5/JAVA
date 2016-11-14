import java.util.Scanner;


class Taxpayer {
  int no;
  float income;
  
  Taxpayer(){
   no = 999999;
   income = 0;
  }
   
}

class UseTaxpayer {

  public static void main(String args[]){

  Taxpayer t[] = new Taxpayer[10];

  Scanner sc = new Scanner(System.in);

  for(int i=0;i<t.length;i++){
   t[i] = new Taxpayer();
  }

  for(int i=0;i<t.length;i++){
    System.out.println(" ENTER Security code :: ");
    t[i].no = sc.nextInt();

    System.out.println(" ENTER INCOME :: ");
    t[i].income = sc.nextFloat();

    if(t[i].income > 10000 && t[i].income < 100000){
        t[i].income += 10000;
    }

  }

  for(int i=0;i<t.length;i++) {
   System.out.println("Security no :: " + t[i].no + " INCOME IS :: " + t[i].income);
  }
 }

 }