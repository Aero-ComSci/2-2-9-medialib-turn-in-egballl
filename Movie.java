/*
 * Activity 2.2.7
 *
 * A Movie class for the MediaLibrary program
 */
public class Movie
{
  private String title;
  private double dur;
  private int rating;

  public Movie(String t, double d)
  {
    title = t;
    dur = d;
    rating = 0;
  }

  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return dur;
  }

  public int getRating() {
    return rating;
  }

  public String toString()
  {
    String info = "\"" + title + "\" (" + dur + " hrs)";
    if (rating != 0) {
      info += ", rating is " + rating;
    }
    return info;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setDuration(double d) {
    dur = d;
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
    amt = -1;
    return rating;
  }

  public boolean equals(Movie other)
  {
    if (other == null) return false;
    return this.title.equals(other.title);
  }
}
