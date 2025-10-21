/** 
 * @author Mia A  
 * @since Oct 3 2025
 * @version 1.0
 * Notes for topics 1.8-1.15
*/
public class Main {
/**
 * Main method is the entry point for program 
 * @Paran input is an array of strings 
 */
   public static void main(String []args) {
      String lastWord = message.substring(8);
      System.out.println(lastWord);

      String message1 = "This is cool";
      String message2= "This is not cool"; 

      int indexOfNot1 = message1.indexOf("not");
      int indexOfNot2 = message2.indexOf("not"); 

      System.out.println("index of not in message1: " + indexOfNot1); //-1
      System.out.println("index of not in message2: " + indexOfNot2); //8

      //.equals() allows you to compare the contents of two string objects 
      // it checks EVERY CHARACTER in both, then returns a boolean answer

      boolean areTheyEqual = message1.equals(message2);
      System.out.println("does m1 equal m2? + areTheyEqual"); //false
// order doest matter here 

areTheyEqual = message2.equals(message1);
System.out.println(areTheyEqual);

//you can compare string variable to a string literal
areTheyEqaul = message1.equals("this is cool");
system.out.println(areTheyEqual); //true 

// .compareTo compares two strings, charcter by charcter 
//eturns an int representing alphabetical order

System.out.println(message1.compareTo("Z"));//-6
System.out.println(message1.compareTo("t"));//-32
System.out.println(message1.compareTo("A"));//19 
// neg numbers mean the other string comes after 
//the original/calling string, message1


   }
} 
