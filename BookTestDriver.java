
import java.util.Scanner;

public class BookTestDriver
{

   public static void main(String[] args)
   {

      // create an object using the default constructor
      Book book1 = new Book();

      // using the normal constructor, create an object with its title, author,
      // and pages initialized to "C++", "Tony Gaddis", and 1024, respectively.
      // Implicitly sets the open/close status of the object to to false.
      Book book2 = new Book("C++", "Tony", 1024);

      // print bokk1 adn book2
      System.out.println("Book 1\n" + book1);
      System.out.println("\nBook 2\n" + book2);

//        compare book1 and book2
      if (book1.equals(book2))
      {
         System.out.println("the two books are equal");
      } else
      {
         System.out.println("the two books are NOT equal");
      }

      //        compare book1 and book1
      if (book1.equals(book1))
      {
         System.out.println("the two books are equal");
      } else
      {
         System.out.println("the two books are NOT equal");
      }


      System.out.println();
      // Test our readOddInteger() method
      int x = readOddInteger();
      System.out.println("You entered the odd integer: " + x);

      // Also, see sample exam questions on page 5, assignment 5.
   }

   // Sample methods we wrote in class of Dec 5

   /*
   Write a method the repeatedly prompts the user for an ODD integer until
   the user enters an ODD integer, and then returns that odd integer.

   Strategy: we choose to solve this using the divide-and-conquer method:
   We break the problem into two simpler subproblems. Specifically,
   We separate the task of reading an integer (task 1) from the task of reading and
   odd integer (task 2).
    */
//   Task 1: Read any iny integer ( a very general method)
   public static int readAnInteger()
   {

      Scanner kb = new Scanner(System.in);
      System.out.print("Enter an integer: ");

      while (!kb.hasNextInt()) // did the user enter an integer?
      {
         String badInput = kb.next();
         System.out.println("Input exrror. Expected an integer. Found: " + badInput);
         System.out.print("Enter an integer: ");
      }

      int number = kb.nextInt(); // the user did enter an integer, so read and then return it.

      return number;
   }

   // Task 2: read an ODD integer
   public static int readOddInteger()
   {
      int oddNumber;
      do
      {
         System.out.println("Enter an odd integer");
         oddNumber = readAnInteger(); // this is a call to task 1. Read an integer and hope that it's odd! Otherwise, repeat this loop.
         {
            System.out.println("Error: Expected an odd integer but found: " + oddNumber);
         }

      } while (oddNumber % 2 != 1); // while oddNumber is NOT ODD
      return oddNumber;
   }

}
