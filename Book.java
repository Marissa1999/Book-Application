
/**
 * Write a class named Book. The class should have the following instance field (variables):
 * - title
 * - author
 * - number of pages
 * - open/close status
 *
 * In addition, the class must provide the following methods:
 * - A constructor that accepts the title, author, and number on pages for a book
 * and initializes the corresponding instance variables accordingly.
 *
 * - A no-arg constructor that sets the author to "Gaddis", title to "Java",
 * pages to 1424, and the open/close status to false. Must use constructor delegation.
 *
 * - Getter/Setter methods for each instance field.
 *
 * - A toString method that returns a string description of the book that includes
 * the author's name, the book's title and the number of pages.
 *
 * - An equals method that accepts a Book object as an argument. If the argument object
 * holds the same data as the calling object, this method should return true.
 * Otherwise, it should return false.
 *
 * Test your class:
 * - Create a Book object using the default constructor.
 * Let the variable book1 reference that object.
 *
 * - Create a Book object using the normal constructor.
 * Let the variable book1 reference that object.
 */
public class Book
{

   private String title;
   private String author;
   private int pages;
   private boolean open_close_status;

   /**
    * This constructor initializes the title, author, and publisher fields.
    *
    * @param title The book's title.
    * @param author The author's name.
    * @param pages The number of pages in this book.
    */
   public Book(String title, String author, int pages)
   {
      this.title = title;
      this.author = author;
      this.pages = pages;
      this.open_close_status = false;
   }

   public Book()
   {
      this("java", "gaddis", 1424); // constructor delegation
//        this.title="java";
//        this.author="gaddis";
//        this.pages=1424;
//        this.open_close_status = false;
   }

   /*
   Write a toString method that return a description for this book object,
   including the book's title, author, and number of pages.
    */
   @Override
   public String toString()
   {
      String result = "";
      result += "Title: " + title;
      result += "\nAuthor: " + getAuthor();
      result += "\nPages: " + getPages();
      return result;
   }

   // Write an equals method to compare two books.
   // Define two books as equal if they both have the same title, author, and pages.
   public boolean equals(Book b)
   {
      if ((this.title.equalsIgnoreCase(b.title))
              && (this.getAuthor().equalsIgnoreCase(b.getAuthor())
              && (this.getPages() == (b.getPages()))))
      {
         return true;
      } else
      {
         return false;
      }
   }

   
   // Write setter/getter methods for each of the instance variables
   public String getTitle()
   {
      return title;
   }

   public void setTitle(String t)
   {
      this.title = t;
   }

   public String getAuthor()
   {
      return author;
   }

   public void setAuthor(String author)
   {
      this.author = author;
   }

   public int getPages()
   {
      return pages;
   }

   public void setPages(int pages)
   {
      this.pages = pages;
   }

   public boolean get_open_close_status()
   {
      return open_close_status;
   }

   public void set_open_close_status(boolean status)
   {
      this.open_close_status = status;
   }
}
