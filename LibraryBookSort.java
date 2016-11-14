import java.util.Scanner;

class LibraryBook {

  String title;
  String author;
  int pages;

  void get(String a,String b,int c){
   title = a;
   author = b;
   pages = c;
  }

  void display(){
   System.out.println("  " + title + "  " + author + "  " + pages);
  }
}

class LibraryBookSort {

 public static void main(String args[]) {

  String title,author;
  int pages;
  
  LibraryBook l[] = new LibraryBook[5];
  LibraryBook tmp = new LibraryBook();

  for(int i=0;i<l.length;i++){
    l[i] = new LibraryBook();
  }

  Scanner sc = new Scanner(System.in);

  for(int i=0;i<l.length;i++){
   System.out.println(" ENTER TITLE :: ");
   title = sc.next();
   System.out.println(" ENTER AUTHOR :: ");
   author = sc.next();
   System.out.println(" ENTER PAGES :: ");
   pages = sc.nextInt();   

   l[i].get(title,author,pages);
  }

  for(int i=0;i<l.length;i++){
    for(int j=0;j<l.length-1;j++){
       if(l[j].title.compareTo(l[j+1].title) > 0){
            tmp = l[j];
            l[j] = l[j+1];
             l[j+1] = tmp;
        }
    }
   }

  for(int i=0;i<l.length;i++){
     l[i].display();
  }

}
}