import model.*;
import view.*;
import controller.*;

public class App
{
   public static void main(String[] args)
   {
      MainView mainView = new MainView();
      MainController mainController = new MainController(mainView);
      
      mainController.start();
   }
}