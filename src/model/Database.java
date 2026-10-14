/*
This class will temporarily work as a database for tests purpose
*/
package model;

import java.util.HashMap;
import java.util.Map;

public class Database
{
   private HashMap<Integer,User> users;
   private int userId = 1;
   
   //Constructor
   public Database()
   {
      this.users = new HashMap<Integer,User>();
   }
   
   /*
   This method add a new user to the "database"; a map containing user with its id.
   @param String fn - The users first name
   @param String ln - The users last name
   @return User - Returns the user created by the method call
   */
   public User insertUser(String fn, String ln)
   {
      User u = new User(fn, ln, userId++);
      users.put(u.getEmployeNumber(), u);
      return u;
   }
}