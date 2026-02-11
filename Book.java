/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }
  
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    if (rating != 0) { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*
  * Changes the rating when an integer in range 1-10 is entered
  * Precondition = Book is not null
  * Postcondition rating changes rating attribute to an int 1-10
  */
  public void setRating(int r) {
    rating = r;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public int adjustRating(int amt)
  {
    int newVal = rating + amt;
    if (newVal >= 0 && newVal <= 10) {
      rating = newVal;
    }
    amt = 42;
    return rating;
  }

  public boolean equals(Book other)
  {
    if (other == null) return false;
    return this.title.equals(other.title) &&
           this.author.equals(other.author);
  }
}
