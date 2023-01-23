package week9.main;

import week7.TextUserInterface;
import week9.mooc.UserInterface;

public class UserInterface2 {
    public static void main(String[] args) {
        UserInterface ui = (UserInterface) new TextUserInterface(null, null);
         
         new ApplicationLogic().execute(3);
 
         Person p = new Person("Name", 121);
     }
}
