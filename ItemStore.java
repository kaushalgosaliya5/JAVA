import java.io.*;
import java.util.*;

class Items implements Serializable {

  int id;
  int qty;
  double price;
  double total;

  Items(int id,double price) {   
    this.id = id;
    this.price = price;   
  }

  Items(int id,int qty,double price){
   this.id = id;
   this.qty = qty;
   this.price = price;
   this.total = qty * price;
  }
 
  public void display(){
    System.out.println( id + "   " + qty + "   " + price + "   " + total);
  }
}


class ItemStore {

  public static void main(String args[])  throws                                          
  IOException,ClassNotFoundException, FileNotFoundException{
   
   Scanner sc = new Scanner(System.in);
   ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream("Items.txt"));   

   Items itm[] = new Items[3];

   int id;
   double price;

   for(int i=0;i<3;i++){
     
    System.out.println(" id is :: ");
    id = sc.nextInt();
    
    System.out.println(" price is :: ");
    price = sc.nextDouble();

    itm[i] = new Items(id,price);
    oos1.writeObject(itm[i]);
   }
      
   oos1.close();   

   ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("Orders.txt"));   
   ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("Items.txt"));   

   int oid,oqty;

   System.out.println(" enter id :: ");
   oid = sc.nextInt();
   System.out.println(" enter qty :: ");
   oqty = sc.nextInt();

   Items it1;
   Items it2;
   int c = 1;

   for(int i=0;i<3;i++){
       it1 = (Items)ois1.readObject();
       int a = (int)(it1.id);

      if(oid == a){
           it2 = new Items(oid,oqty,(double)(it1.price));
           oos2.writeObject(it2);
           c = 0;         
      }   
   }

   if(c == 1){
    System.out.println("your item is not found");
   }

   ois1.close();
   oos2.close();  

  if(c != 1){
    ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("Orders.txt"));

    Items it3;
 
    System.out.println("ID  QTY  PRICE  TOTAL");

    for(int i=0;i<1;i++){
       it3 = (Items)ois2.readObject();
       it3.display();
    }

    ois2.close();  
   }

  }
}












