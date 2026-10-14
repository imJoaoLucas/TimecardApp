package view;

import java.util.Scanner;
import model.User;

public class CreateUserView
{
   private Scanner scanner = new Scanner(System.in);
   
   public String askFirstName()
   {
      System.out.println("Type First Name: ");
      return scanner.next();
   }
   
   public String askLastName()
   {
      System.out.println("Type Last Name: ");
      return scanner.next();
   }
   
   public String askEmployeNumber()
   {
      System.out.println("Type Employe Number: ");
      return scanner.next();
   }
   
   public void employeCreatedMsg(User u)
   {
      System.out.println("Sucessfully Created!!");
      System.out.printf("%s, %s - Employee Number: %d\n", u.getLastName(), u.getFirstName(), u.getEmployeNumber());
   }
}