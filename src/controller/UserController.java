package controller;

import view.*;
import model.*;

public class UserController
{
   private CreateUserView view;
   
   public UserController(CreateUserView view)
   {
      this.view = view;
   }
   
   public User createUser()
   {
      String firstName = view.askFirstName();
      String lastName = view.askLastName();
      int employeNum = Integer.parseInt(view.askEmployeNumber());

      return new User(firstName, lastName, employeNum);
   }
}