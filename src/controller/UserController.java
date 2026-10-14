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
   
   public void createUser(Database db)
   {
      String firstName = view.askFirstName();
      String lastName = view.askLastName();
      
      User newUser = db.insertUser(firstName, lastName);
      
      view.employeCreatedMsg(newUser);
   }
}