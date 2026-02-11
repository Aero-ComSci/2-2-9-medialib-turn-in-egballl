/*
 * Activity 2.2.7
 *
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book bk;
  private Movie mv;
  private Song sg;

  private static int numBooks = 0;
  private static int numMovies = 0;
  private static int numSongs = 0;

  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }

  public static int getNumEntries() {
    return numBooks + numMovies + numSongs;
  }

  public void addBook(Book b)
  {
    bk = b;
    numBooks++;
  }

  public void addMovie(Movie m)
  {
    mv = m;
    numMovies++;
  }

  public void addSong(Song s)
  {
    sg = s;
    numSongs++;
  }

  public Book getBook()
  {
    return bk;
  }

  public void testBook(Book tst)
  {
    tst.setTitle("CHANGED IN testBook");
    System.out.println("Inside testBook: " + tst);
  }

  public String toString()
  {
    String out = "";
    if (bk != null) out += "Book: " + bk + "\n";
    if (mv != null) out += "Movie: " + mv + "\n";
    if (sg != null) out += "Song: " + sg;
    return out;
  }
}
