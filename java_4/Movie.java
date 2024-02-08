import java.time.LocalDateTime;

public class Movie {
    protected final String movieName;
    protected final LocalDateTime movieDate;
    protected float rating;
    protected String genre;
    protected static int movieCounter = 0;
    protected static final int ratingForOscar = 9;
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        if (rating > 0 || rating <= 10) {
            this.rating = rating;
        }
    }
    public Movie(String movieName, float rating, String genre) {
        this.movieName = movieName;
        this.movieDate = LocalDateTime.now();
        setRating(rating);
        this.genre = genre;
        movieCounter++;
    }
    public void resetMovieCounter() {
        movieCounter = 0;
    }
    public boolean hasWonOscar() {
        boolean wonOscar = rating >= ratingForOscar;
        System.out.printf("Movie %s has " + (!wonOscar ? "not " : "") + "won the oscar%n", movieName);
        return wonOscar;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieDate=" + movieDate +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }
}