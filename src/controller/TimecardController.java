package controller;
import java.util.Scanner;
import model.*;
import view.*;

public class TimecardController
{
   private User user;
   private ConsoleView view;
   Scanner scanner = new Scanner(System.in);
   
   //Constructor
   public TimecardController(User u, ConsoleView c)
   {
      user = new User("joao");
      view = new ConsoleView();
   }
   
   public void start()
   {
      boolean running = true;
      
      while (running)
      {
         view.showMenu();
         int sentinel = scanner.nextInt();
         
         switch (sentinel)
         {
            case 1:
               view.showMsg("Clocking in...");
               break;
            case 2: 
               view.showMsg("Clocking out...");
               break;
            case 3: 
               running = false; 
               break;
            default:
               view.showMsg("Invalid Option");                       
         }
      }
   }
   
}