package view;

import java.util.Scanner;

public class ConsoleView
{
   public void showMenu() 
   {
      System.out.println("1. Clock In");
      System.out.println("2. Clock Out");
      System.out.println("3. Exit");
   }
   
   public void showMsg(String s)
   {
      System.out.println(s);
   }
}