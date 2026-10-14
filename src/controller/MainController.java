package controller;

import view.*;
import model.*;
import java.util.Scanner;

public class MainController
{
   private MainView mainView;
   private ConsoleView consoleView;
   private CreateUserView createUserView;
   private TimecardController timecardController;
   private UserController userController;
   private Scanner scanner = new Scanner(System.in);
   
   public MainController(MainView mainView)
   {
      this.mainView = mainView;
      this.consoleView = new ConsoleView();
      this.createUserView = new CreateUserView();
      this.timecardController = new TimecardController(new User("joao"), consoleView);
      this.userController = new UserController(createUserView);
   }
   
   public void start()
   {
      boolean running = true;
      while (running)
      {
         mainView.showMenu();
         int sentinel = scanner.nextInt();
         switch(sentinel)
         {
               case 1: //Console
                  timecardController.start();
                  break;
               case 2: //Create User
                  User u2 = userController.createUser();
                  
                  System.out.println(u2.getLastName());
                  break;
               case 3:
                  running = false;
                  break;
              
               default:
                  mainView.showMsg("Incorrect Input");
         }            
      }
   }

}