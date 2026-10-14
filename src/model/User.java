package model;

import java.util.Stack;
import java.time.LocalDateTime;

public class User 
{
   private String firstName;
   private String lastName;
   private int employeNumber;
   private Stack<TimeEntry> entries;
   
   //Constructor
   public User(String n)
   {
      firstName = n;
   }
   
   public User(String fn, String ln, int en)
   {
      firstName = fn;
      lastName = ln;
      employeNumber = en;
   }
   
   //Getters and Setters
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getEmployeNumber()
   {
      return employeNumber;
   }
   
   public Stack<TimeEntry> getEntries()
   {
      return entries;
   }
   
   //Setters
   
   public void setFirstName(String n)
   {
      firstName = n;
   }
   
   public void setLastName(String n)
   {
      lastName = n;
   }
   
   public void setEmployeNumber(int i)
   {
      employeNumber = i;
   }
   
   public void setEntries(Stack<TimeEntry> e)
   {
      Stack<TimeEntry> entries = e;
   }
   
   //Other methods
   
   public void addEntry(TimeEntry t)
   {
      entries.push(t);
   }
   
   
   
}