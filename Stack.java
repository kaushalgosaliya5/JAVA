import java.util.Scanner;

class Stack
{
 static int st[] = new int[5];
 static int top = -1;

 public static void main(String args[])
 {
    int ch,val,i;

    Scanner sc = new Scanner(System.in);

    do
    {
     
     System.out.println("\n  |------- menu -------|");
     System.out.println("\n     1. PUSH    ");
     System.out.println("\n     2. POP     ");
     System.out.println("\n     3. PEEP    ");
     System.out.println("\n     4. DISPLAY ");
     System.out.println("\n     5. EXIT    ");
     System.out.println("\n  |--------------------|");

    System.out.println("\n enter your choice :: ");
    ch = sc.nextInt();

    switch(ch)
      {
        case 1:
                System.out.println("\n enter push value :: ");
                val = sc.nextInt();

                push(val);
                break;

        case 2:
                System.out.println("\n your pop value is :: " + pop());
                 
                break;
 
        case 3:
                System.out.println("\n enter which number value peep :: ");
                i = sc.nextInt();

                System.out.println("\n your peep value is :: " + peep(i));
                
                break;

        case 4:
                display();
                break;

        case 5:
                System.out.println("\n your program is exit");
                
                break;

        default:
                System.out.println("\n your choice is wrong");
              
               break;
    }
   }while(ch != 5);
  }

 static void push(int val)
 {
    if(top == 4)
    {
      System.out.println("\n over flow ");
    
      return;
    }

  //  top = top + 1;
 
    st[++top] = val;
  }

 static int pop()
  {
    if(top == -1)
    {
      System.out.println("\n under flow ");
  
      return 0;
    }

    return st[top--];
 }

 static int peep(int i)
 {
   if(top-i+1 < 0)
   {
     System.out.println("\n under-flow peep");
     return 0;
   }
   else
   {
     return (st[top-i+1]);
   }
 }

 static void display()
 {
   int i;

    if(top == -1)
    {
      System.out.println("\n array is empty ");
    }

    for(i=top;i>=0;i--)
     {
        System.out.println("  " + st[i]);
     }
  }
}