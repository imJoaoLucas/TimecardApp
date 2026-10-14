package view;

public class MainView
{
   public void showMenu() 
   {
      System.out.println("1. Clock In/Out");
      System.out.println("2. Create User");
      System.out.println("3. Exit");
   }
   
   public void showMsg(String s)
   {
      System.out.println(s);
   }
}