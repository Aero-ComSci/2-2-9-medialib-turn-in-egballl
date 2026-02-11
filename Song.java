/*
 * Activity 2.2.9
 *
 * A Song class for the MediaLibrary program
 */
public class Song
{
  private String title;
  private int rating;

  public Song(String t)
  {
    title = t;
    rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  public String toString()
  {
    String info = "\"" + title + "\"";
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setRating(int r) {
    rating = r;
  }

  public int adjustRating(int amt)
  {
    int nv = rating + amt;
    if (nv >= 0 && nv <= 10) {
      rating = nv;
    }
    amt = 7;
    return rating;
  }

  public boolean equals(Song other)
  {
    if (other == null) return false;
    return this.title.equals(other.title);
  }
}
