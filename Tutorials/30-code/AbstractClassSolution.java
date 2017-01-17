public class AbstractClassSolution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      AbstractClassBook new_novel=new AbstractClassMyBook(title,author,price);
      new_novel.display();
      
   }
}